package Test1;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -11:15
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b%a==0||a+b>1000) System.out.println(a);
        else System.out.println(b);
    }
}
