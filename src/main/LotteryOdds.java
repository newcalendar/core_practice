package main;

import java.util.Scanner;

/**
 * 此类展示了循环
 * @author Leeqingyi
 * @time 2021/6/20
 */

public class LotteryOdds {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k=in.nextInt();

        System.out.println("What is the highest number you can draw");
        int n=in.nextInt();


        int lotterOdds=1;
        //循环给lotterOdds赋值
        for (int i=1;i<=k;i++)
            lotterOdds=lotterOdds*(n-i+1)/i;
        System.out.println("Your odds are 1 in "+lotterOdds+".Good luck!");
    }
}
