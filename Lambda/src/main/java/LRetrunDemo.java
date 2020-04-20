import java.util.Arrays;
import java.util.Comparator;

/*
方法的返回类型是一个接口
 */
public class LRetrunDemo {
//    public Comparator<String> getCompatable()
//    {
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        };
//    }
//    public Comparator<String> getCompatable()
//    {
//        return (String o1,String o2)-> { return o2.length()-o1.length();
//            };
//        }
    public static Comparator<String> getCompatable()
    {
        return ( o1, o2)-> o2.length()-o1.length();
    }

    public static void main(String[] args) {
        String[] arr={"aaa","bb","c","sddd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getCompatable());
        System.out.println(Arrays.toString(arr));
    }
    }
