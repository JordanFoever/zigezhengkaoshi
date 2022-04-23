package Test3_switch;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -19:33
 */
public class Exer2 {
    public static void main(String[] args) {
        int year,month;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        year = sc.nextInt();
        System.out.println("请输入一个月份");
        month = sc.nextInt();
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31天");break;
            case 4: case 6: case 9: case 11:
                System.out.println("30天");break;
            case 2:
                if(year%4==0&&year%100!=0||year%400==0){
                    System.out.println("29天");
                }else {
                    System.out.println("28");
                }
                break;

        }
    }
}
