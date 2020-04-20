package Demo01;

import java.io.File;

/**
 * File类获取功能的用法
 */
public class Demo0 {
    public static void main(String[] args) {
        String s=new String("D:\\JDK doc\\jdk-11.0.4_doc-all\\docs");
        File demo=new File(s);
        System.out.println(demo);
        String absolutepath=demo.getAbsolutePath();//获取绝对路径
        System.out.println(absolutepath);
        String s02=new String("docs");
        File demo02=new File(s02);
        System.out.println(demo02.getAbsolutePath());
        System.out.println(demo.getPath());//获取构造方法中的path，调用的就是toString方法
        System.out.println(demo02.getPath());
        System.out.println(demo.getName());//获取路径结尾（文件或文件夹）
        System.out.println(demo.length());//文件夹是没有大小概念的，可以用来打印文件的大小属性
    }
}
