package main; /**
 * 此类用于一个大数据类型来计算一个中奖概率
 * time  2021/6/17
 * @author Leeqingyi
 *
 */

/*
BigInteger和BigDecimal分别表示大整数类和大浮点数
* BigInteger 类型的数字范围较 Integer 类型的数字范围要大得多。BigInteger 支持任意精度的整数，也就是说在运算中 BigInteger 类型可以准确地表示任何大小的整数值。
* */
import java.math.*;
import java.util.*;

public class BigTest
{
    public static void main(String[] args)
    {
//        输入数据
        Scanner in = new Scanner(System.in);

        System.out.print("你需要选择多少位数字? ");
        int k = in.nextInt();

        System.out.print("你能选择的最高数字? ");
        int n = in.nextInt();

        /*
         * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++)
//            multiply为乘法
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(
                    BigInteger.valueOf(i));

        System.out.println("你的赔率 " + lotteryOdds + ". Good luck!");
    }
}
