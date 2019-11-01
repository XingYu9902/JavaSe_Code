/*
    编写程序，从控制台输入三个整数分别存入变量num1、num2、num3
    对他们进行排序，并且从小到大输出。

    思路：
        随便先排两个数的小关系，在跟第三个数比。
 */

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int temp;
        if (num1 < num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 < num3){
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 < num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num3+" "+num2+" "+num1);

    }
}
