package Test1;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -10:24
 */
public class Exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个数");
            int i = sc.nextInt();
            if (i > 5) {
                System.out.println(i + "你输入的数大于5");
            } else if (i > 2) {
                System.out.println(i + "这个数小于等于5并且大于2");
            } else if (i == 2) {
                System.out.println("判断结束");
                break;
            } else {
                System.out.println("*");
            }
        }
    }
}
