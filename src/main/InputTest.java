package main;

import java.util.Scanner;

/**
 * 此类为输入测试类
 *
 * @author Leeqingyi
 * @time 2021/6/20
 */

public class InputTest {
    public static void main(String[] args) {
        //Scanner为Java的输入工具类
        Scanner in=new Scanner(System.in);

        System.out.println("What is your name?");
        //定义一个字符串，将输入数据赋值给该字符串
        String name=in.nextLine();

        System.out.println("How old are you?");
        int age=in.nextInt();

        System.out.println("Hello"+name+".Next year,you'll be "+(age+1));
    }
}
