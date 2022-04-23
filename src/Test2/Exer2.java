package Test2;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -15:15
 *
 * 输入一个数判断是不是素数
 */
public class Exer2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while (true){
           System.out.print("请输入一个数");
           int a = sc.nextInt();
           boolean  flag = false;

           for(int i = 2;i<a;i++){
                flag = a%i==0?false:true;
                if(flag == false) break;;
           }
           if(flag==false) System.out.println("不是素数");
           else System.out.println("是素数");
       }
    }
}




