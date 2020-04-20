package Bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServletSocket  {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            while (true){
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                byte[] b = new byte[20];
                is.read(b);
                String hostAddress = ss.getInetAddress().getHostAddress();
                System.out.println(hostAddress+":"+new String(b));
                OutputStream os = s.getOutputStream();
                Scanner scanner = new Scanner(System.in);
                String s1 = scanner.nextLine();
                os.write(s1.getBytes());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
