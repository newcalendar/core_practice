package main;

import org.junit.Test;

/**
 * 此类展示了怎么存取二维数组
 * time 2021/6/17
 *
 * @author Leeqingyi
 */

public class array_2d {
    public static void main(String[] args) {

        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // set interest rates to 10 . . . 15%
//        创建一个double数组，长度为6
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
//            循环插入数据
            interestRate[j] = (STARTRATE + j) / 100.0;
//创建一个长度为6的二维数组
        double[][] balances = new double[NYEARS][NRATES];

        // set initial balances to 10000
//        初始化balances【0】数组
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;

        // compute interest for future years
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // get last year's balances from previous row
                double oldBalance = balances[i - 1][j];

                // compute interest
                double interest = oldBalance * interestRate[j];

                // compute this year's balances
                balances[i][j] = oldBalance + interest;
            }
        }

        // print one row of interest rates
        for (int j = 0; j < interestRate.length; j++)
//            保留整数百分比
            System.out.printf("%9.0f%%", 100 * interestRate[j]);

        System.out.println();

        // print balance table
          //  for (double[] row : balances)  相当于遍历，增强for循环
        for (double[] row : balances) {
            // print table row
            for (double b : row)
             //   保留两位小数
                System.out.printf("%10.2f", b);
           //输出一组后换行
            System.out.println();
        }
    }


    //用单元测试，测试增强遍历和数组默认初始值
    @Test
    public void test(){
        double [] [] test=new double[4][4];
        test[0][3] =1;
        for(double[] row :test) {
            for (double b:row)
            System.out.println(b);

            System.out.println();
        }

    }
}
