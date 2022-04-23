package Test1;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -11:12
 */
public class Exer5_1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.println("请输一个0-31之间的数");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("请输入另一个数");
        while (true){
            int j = sc.nextInt();
            if(j>i){
                b = j;
                // 如果输入的数大的话,先将其存在大的数里面
                System.out.println("你输入的数大了,请输入"+a+"到"+b+"之间的数");
            }else if (j<i){
                a = j;
                System.out.println("你输入的数小了"+a+"到"+b+"之间的数");
            }else {
                System.out.println("输入正确");
                break;
            }
        }
    }
}
