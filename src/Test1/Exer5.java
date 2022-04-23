package Test1;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -10:39
 *
 * 猜数字(升级版)
 */
public class Exer5 {
    // 初始化一些数
    static int left = 0;  //左边的范围
    static int right = 31; //右边的范围
    static int max = 0;  //大的数
    static int min = 0; //小的数

    public static void main(String[] args) {
        System.out.println("请输一个0-31之间的数");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("请输入另一个数");
        while (true){
            int j = sc.nextInt();
            if(j>i){
                // 如果输入的数大的话,先将其存在大的数里面
                max = j;
                System.out.println("你输入的数大了,请输入"+left+"到"+max+"之间的数");
                right  = max;
                min = left;
            }else if (j<i){
                min = j;
                System.out.println("你输入的数小了"+min+"到"+right+"之间的数");
                left = min;
                max = right;
            }else {
                System.out.println("输入正确");
                break;
            }
        }
    }
}

