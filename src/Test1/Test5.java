package Test1;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -13:48
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("是偶数");
        }else{
            System.out.println("是奇数");
        }
    }
}
