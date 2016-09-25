package zuobin;

import sun.text.resources.cldr.ia.FormatData_ia;

/**
 * Created by Administrator on 2016/9/25.
 */
public class SecondArray {
    public static void main(String[] args) {
        int[][]ints=new int[5][4];
        for (int i = 0; i <ints.length ; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                //System.out.println(ints[1][1]);

            }

        }

        System.out.println(ints.length);
        System.out.println(ints[0].length);
        System.out.println(ints[1].length);
        System.out.println(ints[2].length);
        System.out.println(ints[3].length);
    }


}
