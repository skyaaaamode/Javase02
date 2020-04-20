package NIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest {
    public static void main(String[] args) {
        try {
            FileOutputStream fs = new FileOutputStream("basic.txt");
            FileChannel channel = fs.getChannel();
            ByteBuffer allocate = ByteBuffer.allocate(1024);
            allocate.put("你好，nio".getBytes());
            allocate.flip();
            channel.write(allocate);
            channel.close();
            fs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File file = new File("basic.txt");
            long length = file.length();
            FileInputStream fis = new FileInputStream(file);
            FileChannel channel = fis.getChannel();
            ByteBuffer fc = ByteBuffer.allocate((int) length);
            channel.read(fc);
            System.out.println(new String(fc.array()));
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
