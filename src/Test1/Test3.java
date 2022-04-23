package Test1;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -11:37
 * <p>
 * <p>
 * 输入三个数比较大小
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入三个数");
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int value : a) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("最大值是"+max);
    }
}
