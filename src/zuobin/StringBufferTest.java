package zuobin;

/**
 * Created by Administrator on 2016/9/25.
 */
public class StringBufferTest {
    private static final String ABC="abc";

    public static void main(String[] args) {
        String s="";
        for (int i = 0; i < 30000000; i++) {
            s+=ABC;
        }
        System.out.println(s.length());
        StringBufferTest stringBufferTest=new StringBufferTest();
        for (String arg : args) {
        }

    }


}
