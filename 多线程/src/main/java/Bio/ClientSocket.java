package Bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
    public static void main(String[] args) {

            while (true){
                try {
                    Socket s = new Socket("127.0.0.1",9999);
                    System.out.println("请输入");
                    OutputStream os = s.getOutputStream();
                    Scanner scanner = new Scanner(System.in);
                    String s1 = scanner.nextLine();
                    os.write(s1.getBytes());
                    InputStream is = s.getInputStream();
                    byte[] b = new byte[20];
                    is.read(b);
                    System.out.println(new String(b));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }
}
