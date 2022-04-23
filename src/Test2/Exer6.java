package Test2;

/**
 * @author weijiangquan
 * @date 2022/4/23 -19:16
 *
 * 九九乘法表
 */
public class Exer6 {
    public static void main(String[] args) {
        for(int i = 1;i<=9;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
