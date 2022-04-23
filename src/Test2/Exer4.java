    package Test2;
    /**
     * @author weijiangquan
     * @date 2022/4/23 -18:52
     */
    /*
    100000以内质数的输出
    质数：素数，只能被1和它本身整除的自然数。 ---->从2开始，到 n-1 结束，都不能被 n 整除。

    对 PrimeTest中的代码进行一个优化
    */
    //方式一：
    class Exer4{
        public static void main(String[] args) {
            //boolean isFlag = true;  //标识：i是否被j除尽 ， 如果除尽修改其值
            long start = System.currentTimeMillis();
            //int count = 0;//记录质数的个数
            for (int i = 2;i <= 100000;i++){
                boolean isFlag = true;  //标识：i是否被j除尽 ， 如果除尽修改其值
                //优化二：只对本身是质数的自然数有效。
                for(int j = 2;j <= Math.sqrt(i);j++){   // Math.sqrt(i)即 根号i
                //for(int j = 2;j < i;j++){
                    if(i % j == 0){  // i 被 j 除尽
                        isFlag = false;
                        break;//优化一：只对本身非质数的自然数有效。
                    }
                }
                if(isFlag == true){
                    System.out.println(i);
                    //count++;
                }
                //重置isFlag
                isFlag = true;
            }
            long end = System.currentTimeMillis();
            //System.out.println("质数的个数为：" + count);
            System.out.println("当前代码花费的时间是：" + (end - start));
        }
    }
    /* 正常输入：16565 毫秒
       将 isFlag 放到 for 循环里： 14234毫秒
       优化一: 内部for循环加上 break： 1694毫秒
       优化二: 判断j<根号i：485毫秒
    */
    /* 将输出方式改为记录个数：
        未优化：11361毫秒
        优化一break：1041毫秒
        优化二根号i：10毫秒！！
    */


