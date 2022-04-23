package Test3_switch;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -19:24
 *
 * 分数输出
 */
public class Exer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.println("输入一个分数");
            int score = sc.nextInt();

            int a = score/10;
            switch(a){
                case 10:
                case 9:
                    System.out.println("优秀");
                    break;
                case 8:
                    System.out.println("良好");
                    break;
                case 7:
                    System.out.println("中等");
                    break;
                case 6:
                    System.out.println("及格");
                    break;
                default:
                    System.out.println("不及格");
                    break;
            }
    }
}
