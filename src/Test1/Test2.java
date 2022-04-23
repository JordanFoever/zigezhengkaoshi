package Test1;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -11:19
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入三角形的三条边");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a+b>c&&a+c>b&&b+c>a&&a-b<c&&a-c<b&&b-c<a){
            if(a==b||a==c||b==c){
                System.out.println("你输入的是等腰三角形");
                if(a==b&&b==c){
                    System.out.println("正三角形");
                }
            }
             else if((a*a+b*b == c*c)||(a*a+c*c==b*b)||(b*b+c*c==a*a))
                System.out.println("直角三角形");
             else if(a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b)
                System.out.println("钝角三角形");
             else
                System.out.println("锐角三角形");
        }else {
            System.out.println("不能构成三角形");
        }
    }
}

