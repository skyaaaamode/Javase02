package Demo01;

import java.io.File;

/**
 * File类中的判断方法
 */
public class Demo02 {
    public static void main(String[] args) {
        //exist判断路径是否存在
        File s=new File("D:\\JDK doc\\jdk-11.0.4_doc-all\\docs\\index.html");
        File s01=new File("D:\\JDK doc\\jdk-11.0.4_doc-all\\docs");
        System.out.println(s.exists());//判断路径是否存在
        if(s01.exists())//用之前最好判断一下是否存在
        {
            System.out.println(s01.isDirectory());//判断路径结尾是否为目录
            System.out.println(s01.isFile());//判断路径结尾是否为文件
        }

    }
}
