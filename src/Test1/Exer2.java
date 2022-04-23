package Test1;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -10:20
 */
public class Exer2 {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        if(i>5) System.out.println(i+"你输入的数大于5");
        else  if(i<=5&&i>3) System.out.println(i+"这个数小于等于5并且大于2");
        else System.out.println("*");
    }
}
