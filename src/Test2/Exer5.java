package Test2;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -19:05
 *
 *
 * 水仙花数
 */
public class Exer5 {
    public static void main(String[] args) {
        System.out.print("请输入一个三位数:");
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            int num1 = a%100%10; //个位
            int num2 = a%100/10; //十位
            int num3 = a/100;  //百位

            if(num1*num1*num1+num2*num2*num2+num3*num3*num3==a){
                System.out.println("你输入的数是水仙数");
                break;
            }else {
                System.out.println("不是水仙数");
                System.out.print("请重新再次输入");
            }
        }

    }
}
