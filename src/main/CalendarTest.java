package main;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 此类为日历相关类
 * @author Leeqingyi
 * @time 2021/6/20
 */

public class CalendarTest {
    public static void main(String[] args) {
//        LocalDate是不变的日期时间对象代表一个日期，往往被视为年月日。其他日期字段，如一年中的一天，一周和一周的一天，也可以访问。例如，“2007年10月2日”的值可以被存储在一个LocalDate
//        获取当前时间
        LocalDate date = LocalDate.now();

/*        getMonthValue()
        从1到12得到一个月的时间字段。*/
        int month = date.getMonthValue();

/*        getDayOfMonth()
        获取月字段的一天。*/
        int today = date.getDayOfMonth();

/*        minusDays(long daysToSubtract)
        返回一份本 LocalDate与指定的天数减去。*/
        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");

           /* plusDays(long daysToAdd)
            返回一份本 LocalDate与指定的天数增加。*/
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }

        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();


/*      printf主要是继承了C语言的printf的一些特性，可以进行格式化输出
        print就是一般的标准输出，但是不换行
        println和print基本没什么差别，就是最后会换行


        'd' 整数结果被格式化为十进制整数
        'o' 整数结果被格式化为八进制整数
        'x', 'X' 整数结果被格式化为十六进制整数
        'e', 'E' 浮点结果被格式化为用计算机科学记数法表示的十进制数
        'f' 浮点结果被格式化为十进制数
        'g', 'G' 浮点根据精度和舍入运算后的值，使用计算机科学记数形式或十进制格式对结果进行格式化。
        'a', 'A' 浮点结果被格式化为带有效位数和指数的十六进制浮点数
        */
    }
}
