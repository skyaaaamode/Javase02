package NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class NIOTest02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("basic.txt");
            FileOutputStream fos = new FileOutputStream("asic.txt");
            FileChannel channel = fis.getChannel();
            FileChannel channel1 = fos.getChannel();
            long l = channel1.transferFrom(channel, 0, channel.size());
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
