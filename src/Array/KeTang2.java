package Array;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

/**
 * @author weijiangquan
 * @date 2022/4/23 -14:28
 *
 * 二维数组
 */
public class KeTang2 {
    public static void main(String[] args) {
        // 二维的第二个可以现在不用写
        int a[][] = new int[10][];

        int b[][] = new int[10][4];
        int c[][] = new int[][]{{1,2,3},{2,3,4,5,6},{1,2,3,4}};

        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[i].length;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();

        }


    }
}
