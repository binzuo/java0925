package zuobin;

import java.util.Hashtable;

/**
 * Created by Administrator on 2016/9/25.
 */
public class Question {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> hashtable=new Hashtable <>();
        hashtable.put(1,10);
        hashtable.put(3,300);
        System.out.println(hashtable.size());
        System.out.println(hashtable.get(3));
        

    }
}
