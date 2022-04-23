package Array;

/**
 * @author weijiangquan
 * @date 2022/4/23 -14:22
 */
public class KtTang1 {
    public static void main(String[] args) {

        // System.arraycopy数组的赋值的使用

        int a[] = {1,23,4,5,6};
        int b[] = new int[a.length];
        System.arraycopy(a,0,b,0,a.length);

        for (int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}
