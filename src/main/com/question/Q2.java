package main.com.question;

/**
 * 题目：判断101-200之间有多少个素数，并输出所有素数。
 *
 * @author Leeqingyi
 * @time 2021/6/22
 */

public class Q2 {
    public static void main(String[] args) {
        int count = 0;
//        从101开始算，依次累加
        for (int i = 101; i < 200; i += 2) {
            boolean b = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                System.out.println(Math.sqrt(i));
//                从2开始对i进行素数判断
                if (i % j == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }

//            根据返回的Boolean值来进行判断输出
            if (b == true) {
//                当判断为TRUE时,素数总数累加
                count++;
//                输出判断为素数的值
                System.out.println(i);
            }
        }
//        输出统计的总值
        System.out.println("素数个数是: " + count);
    }
}
