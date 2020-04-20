package ifrsst;

import org.w3c.dom.ls.LSOutput;

import java.io.File;

public class FileStatic {
    /**
     * file有四个静态变量
     * 操作路径不能写死，因为不同的操作系统的分隔符可能有区别
     */
    public static void main(String[] args) {
        String s=File.pathSeparator;//路径分割符
        System.out.println(s);
        char s1=File.pathSeparatorChar;
        System.out.println();
        String s03=File.separator;//文件分割符
        char s04=File.separatorChar;
        System.out.println(s03);
        System.out.println(s04);
        //具体应用，再写文件路径的时候写这个静态变量，不用写死
        System.out.println("C:"+s03+s03+"wenjian"+s03+s03+"wode");
    }


}
