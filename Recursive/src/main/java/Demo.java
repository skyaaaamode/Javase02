import java.io.File;
import java.io.FileFilter;

/**
 * 添加文件过滤器FileFilter,重写接口，在accept中进行文件的过滤
 */
class FilrFilterimp implements FileFilter
{
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory())
        {
            return true;
        }
        return pathname.getName().endsWith(".java");
    }
}
public class Demo {
    public void getAllFiles(File pathname)
    {
        if(pathname.exists())
        {
            System.out.println(pathname.getName());
            for (File i:pathname.listFiles(new FilrFilterimp()))
            {
                if(i.isDirectory())
                {
                    getAllFiles(i);
                }
                else
                {
                    System.out.println(i);
                }
            }
        }

    }
    public static void main(String[] args) {
        new Demo().getAllFiles(new File("D:\\Javase02\\Recursive\\src\\main\\java"));
    }
}
