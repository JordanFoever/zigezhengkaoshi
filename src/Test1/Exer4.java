package Test1;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -10:33
 */
public class Exer4 {
    public static void main(String[] args) {
        System.out.println("请输一个1-30之间的数");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (true){
            System.out.println("请输入另一个数");
            int j = sc.nextInt();
            if(j>i){
                System.out.println("你输入的数大了");
            }else if (j<i){
                System.out.println("你输入的数小了");
            }else {
                System.out.println("输入正确");
                return;
            }
        }

    }
}
