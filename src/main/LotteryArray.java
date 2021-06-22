package main;

/**
 * 此类展示一个三角形阵列
 *
 * @author Leeqingyi
 * @time 2021/6/20
 */

/**
 * This program demonstrates a triangular array.
 * @version 1.20 2004-02-10
 * @author Cay Horstmann
 */
public class LotteryArray {
    public static void main(String[] args) {

        final int NMAX = 10;

        // allocate triangular array
        // 用二维数组创建三角形阵型
//        定义列长度为11
        int[][] odds = new int[NMAX + 1][];
//        用for循环定义每横长度1-10
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];

        // fill triangular array
//        填充内容到三角形阵型
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++) {
                /*
                 * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                odds[n][k] = lotteryOdds;
            }

        // print triangular array
//        使用增强for循环遍历数组，先将二维数组每一横读取到row数组里，再进行遍历row的数组,将每一横数组内容输出（嵌套使用for循环）
        for (int[] row : odds) {
            for (int odd : row)
//                定义输出数值格式
                System.out.printf("%4d", odd);

//            换行
            System.out.println();
        }
    }
}
