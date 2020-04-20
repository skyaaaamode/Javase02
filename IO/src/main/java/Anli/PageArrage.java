package Anli;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.创建一个集合
 */
public class PageArrage {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> my=new HashMap();
        FileReader input=new FileReader("D:\\Javase02\\IO\\src\\main\\java\\Anli\\in.txt");
        BufferedReader in=new BufferedReader(input);
        FileWriter output=new FileWriter("D:\\Javase02\\IO\\src\\main\\java\\Anli\\newI0.txt");
        BufferedWriter out=new BufferedWriter(output);
        String line;
        while ((line=in.readLine())!=null)
        {
            //对于line进行切分，看字符串的格式
            String[] arr=line.split("\\.");
            my.put(arr[0],arr[1]);
        }
        //遍历输出结果
        for (Map.Entry<String,String> i:my.entrySet())
        {
            System.out.println(i.getKey()+":"+i.getValue());
            String gg=i.getKey()+"."+i.getValue();
            out.write(gg);
        }
        in.close();
        out.close();

    }

}
