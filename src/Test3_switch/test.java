package Test3_switch;

import java.util.Scanner;

/**
 * @author weijiangquan
 * @date 2022/4/23 -21:27
 */
public class test {
    public static void main(String[] args) {
         boolean a ="dasda"=="dasda"?true:false;
        System.out.println(a);
         Scanner sc = new Scanner(System.in);
         String b = sc.next();
         boolean c = b=="你好"?true:false;


        System.out.println("b"+b);


        System.out.println(b.equals("你好"));
        System.out.println(c);

        System.out.println(b =="你好");


        String aa = "";

    }
}



