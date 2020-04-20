package NIO;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NIO {
    public static void main(String[] args) throws Exception {
         //1.获取通道
        SocketChannel channel = SocketChannel.open();

        //2.设置阻塞方式

        channel.configureBlocking(false);

        //3.提供服务器地址和端口号

        InetSocketAddress inetAddress = new InetSocketAddress("127.0.0.1",9999);

        //4.链接服务器端

       if(!channel.connect(inetAddress)){
           while (!channel.finishConnect()){
               System.out.println("连接中，可以干些别的事情");
           }

       }

       //5.服务器端发数据

        ByteBuffer byteBuffer = ByteBuffer.wrap("你好".getBytes());

       //写入数据

        channel.write(byteBuffer);
        System.in.read();
    }
}
