package zuobin;

import sun.text.resources.cldr.ti.FormatData_ti;

/**
 * Created by Administrator on 2016/9/25.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] ints = new int[20];
        ints[19] = 100;
        System.out.println(ints[19]);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
            System.out.println(ints[i]);
        }
        Object[] objects=new Object[3];
        objects[0]=1;
        objects[1]="name";

    }



}
