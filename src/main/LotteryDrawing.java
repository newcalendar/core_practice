package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 该类演示数组的相关操作，整体功能像是彩票选号似的
 *
 * @author Leeqingyi
 * @time 2021/6/20
 */

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw");
        int n = in.nextInt();

//        定义一个名为number的数组将输入的n值作为该数组的初始长度
        int[] numbers = new int[n];
//        循环赋值给数组的每个值
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

//        定义一个名为result的一维数组，将长度设定为输入的k值
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {

//            创建一个随机数r,在n数值范围，强制转换为int保证无小数
            int r=(int) (Math.random()*n);

//            将number[r]随机值按0-k的顺序赋值
            result[i]=numbers[r];

//            将number[n-1]的值循环的放入随机number[r]
            numbers[r]=numbers[n-1];

//            n值每次做减减
            n--;
        }

//        将数组result按升序进行排序
        Arrays.sort(result);
        System.out.println("Bet the following combination.It'll make you rich!");
//        使用增加for循环将result数组的值输出
        for (int r:result)
            System.out.println(r);
    }
}
