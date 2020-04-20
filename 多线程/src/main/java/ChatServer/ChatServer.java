package ChatServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class ChatServer {
    private ServerSocketChannel ss;
    private Selector selector;
    private int PORT=9999;
    public ChatServer(){
        try {
            ss=ServerSocketChannel.open();

            selector=Selector.open();
            //绑定端口
            ss.bind(new InetSocketAddress(PORT));

            ss.configureBlocking(false);

            //注册监听器
            ss.register(selector,SelectionKey.OP_ACCEPT);
            System.out.println("chat服务器已经启动");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void start() throws IOException {
        //不停轮询
        while (true){
            int select = selector.select(2000);//获取就绪的channel
            if(select==0){
                System.out.println("暂无用户上线，请耐心等待");
                continue;
            }
            Iterator<SelectionKey> iterator = selector.keys().iterator();
            while (iterator.hasNext()){
                SelectionKey next = iterator.next();
                if(next.isAcceptable()){
                    SocketChannel channel = ss.accept();
                    channel.configureBlocking(false);
                    channel.register(selector,SelectionKey.OP_READ);
                    System.out.println(channel.getRemoteAddress().toString()+"上线了.....");
                }
                if(next.isReadable()){
                    readMsg(next);
                }
            }


        }


    }
    public void readMsg(SelectionKey selectionKey) throws IOException {
        SocketChannel channel = (SocketChannel)selectionKey.channel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int read = channel.read(byteBuffer);
        if(read>0){
            System.out.println(new String(byteBuffer.array()));
            post(selectionKey,new String(byteBuffer.array()));
        }
    }
    public void post (SelectionKey exception,String msg) throws IOException {
        System.out.println("服务器发送了广播");
        for (SelectionKey i:selector.keys()){
            SocketChannel channel =(SocketChannel) i.channel();
            if(channel instanceof SocketChannel&&i!=exception){
                ByteBuffer wrap = ByteBuffer.wrap(msg.getBytes());
                channel.write(wrap);
            }
        }

    }

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        try {
            chatServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
