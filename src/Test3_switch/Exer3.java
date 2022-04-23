package Test3_switch;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -21:00
 *
 * 在java中switch的括号中可以使用字符串类型的  好多语言都不支持
 */
public class Exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("请输入一个星期");
            String s = sc.next();
            // if(s=="退出")  这样写好像不行

            if(s.equals("退出")){
                break;
            }else {
                switch (s){
                    case "星期一":
                        System.out.println("Monday");
                        break;
                    case  "星期二":
                        System.out.println("Tuesday");
                        break;
                    case "星期三":
                        System.out.println("Wednesday");
                        break;
                    case "星期四":
                        System.out.println("Thursday");
                        break;
                    case "星期五":
                        System.out.println("Friday");
                        break;
                    case "星期六":
                        System.out.println("Saturday");
                        break;
                    case "星期日":
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("输入的不合法");
                        break;
                }
            }
        }


    }
}
