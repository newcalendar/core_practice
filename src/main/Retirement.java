package main;

import java.util.Scanner;

/**
 * 此类展示While相关操作,计算存款要多少年才能达到
 *
 * @author Leeqingyi
 * @time 2021/6/20
 */

public class Retirement {
    public static void main(String[] args) {
        //输入
        Scanner in=new Scanner(System.in);

        System.out.print("How much money do you need to retire?");
//        目标
        double gobal=in.nextDouble();

        System.out.println("How much money will you contibute every year?");
//        收入
        double payment=in.nextDouble();

        System.out.println("interest rate in %:");
        double interestRate=in.nextDouble();

        double balance=0;
        int years=0;

//判断目前资金是否超过目标资金，否则继续循环以下操作
        while (balance<gobal){
            balance+=payment;
//            利率金等于本金乘以利率
            double interest=balance * interestRate/100;
//            总金额等于本金加利息
            balance +=interest;
//            年数加一,直到总金额达到目标金额
            years++;
        }

        System.out.println("You can retire in "+years+"years.");
    }
}
