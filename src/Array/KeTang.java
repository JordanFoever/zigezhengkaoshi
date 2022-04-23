package Array;

import java.util.Arrays;

/**
 * @author weijiangquan
 * @date 2022/4/23 -14:07
 */
public class KeTang {
    public static void main(String[] args) {
        // 数组定义的三种方式
        int a[] = new int[10];
        int[] b = new int[12];
        int c[] = {1,2,3,4,5,6,7};

        Arrays.sort(c); //排序


        for (int value : c) {
            System.out.println(value);
        }
    }


}
