package Test1;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -9:45
 */

public class Exer1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入年份");
        while (true) {
            int year = sc.nextInt();
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("你输入的是闰年");
                break;
            }else {
                System.out.println("你输入的是平年");
                System.out.println("请重新输入年份");
            }
        }

    }
}
























