package zuobin;

/**
 * Created by Administrator on 2016/9/25.
 */
public class StringTest {
    private String s;

    public StringTest(String s) {
        this.s = s;
    }

    public String upper(String s){

        return s.toUpperCase();
    }
    public String lower(String s1){
        return s1.toLowerCase();
    }
    public static void main(String[] args) {
        StringTest strings = new StringTest("hellozuobin");
       // String s="hellozuobin";
       // String s1="zuobinhello";
        //System.out.println(s.charAt(2));
        //System.out.println(s1.indexOf('o'));
        System.out.println(strings.upper("hellozuobin"));
        StringTest strings1 = new StringTest("HELLOZUOBIN");
        System.out.println(strings1.lower("HELLOZUOBIN"));


    }

}
