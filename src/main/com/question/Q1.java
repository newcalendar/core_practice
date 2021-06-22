package main.com.question;

/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
 * 问每个月的兔子总数为多少？   
 * <p>
 * 这是一个菲波拉契数列问题
 *
 * @author Leeqingyi
 * @time 2021/6/21
 */

//

public class Q1 {
    public static void main(String[] args) {
/*      System.out.println("第1个月的兔子对数:    1");
        System.out.println("第2个月的兔子对数:    1");
        int f1 = 1, f2 = 1, f, M = 24;
        for (int i = 3; i <= M; i++) {
            f = f2;
            f2 = f1 + f2;
            f1 = f;
            System.out.println("第" + i + "个月的兔子对数: " + f2);*/

        int mouth = 24;
        System.out.println(sum(mouth));
    }

    public static int sum(int k) {
        if (k == 1 || k == 2)
            return 1;
        else
            return sum(k - 1) + sum(k - 2);
    }
}

