import java.io.File;

/**
 * 文件搜索，只要.java结尾的文件
 */
public class Example {
    public void SearchFile(File name)
    {
        if(name.exists())
        {
            for (File i:name.listFiles())
            {
                if(i.isDirectory())
                {
                    SearchFile(i);
                }
                else
                {
                    if(i.getName().toLowerCase().endsWith(".java"))
                    {
                        System.out.println(i);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {

    }

}
