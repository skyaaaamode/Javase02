package NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NIOServer {
    public static void main (String[] args) throws IOException {

        //1.获取channel
        ServerSocketChannel ss = ServerSocketChannel.open();

        //2.获取selector
        Selector open = Selector.open();

        //3.绑定端口号

        ss.bind(new InetSocketAddress(9999));

        //4.设置非阻塞方式
        ss.configureBlocking(false);

        //5.将channel注册给selector
        ss.register(open, SelectionKey.OP_ACCEPT);

        //6.执行任务

        while (true){
            /**
             * 1.监控是不是有链接
             */
            if(open.select(1000)==0){
                System.out.println("没有客户端链接，可以做系的事情");
                continue;
            }
            /**
             * 2.得到selectionkey
             */
            Set<SelectionKey> selectionKeys = open.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
           while (iterator.hasNext()){
               SelectionKey i = iterator.next();
               if(i.isAcceptable()){//链接
                    System.out.println("客户端链接事件");
                    SocketChannel accept = ss.accept();
                    accept.configureBlocking(false);
                    accept.register(open,SelectionKey.OP_READ, ByteBuffer.allocate(1024));

                }
                if(i.isReadable())
                {
                    System.out.println("读取客户端事件");
                    SocketChannel channel = (SocketChannel)i.channel();
                    ByteBuffer attachment = (ByteBuffer)i.attachment();
                    try {
                        channel.read(attachment);
                    } catch (IOException e) {
                        i.cancel();
                        channel.socket().close();
                        channel.close();
                        return;
                    }
                    System.out.println("客户端发来数据"+new String(attachment.array()));
                }
                //手动移除key，防止重复调用
                iterator.remove();
            }

        }


    }
}
