/*
    一个正整数的因子是所有可以整除它的正整数。
    而一个数如果恰好等于除它本身外的因子之和，这个数就称为完数。例如6=1＋2＋3(6的因子是1,2,3)。

    现在，你要写一个程序，读入两个正整数n和m（1<=n<m<1000），输出[n,m]范围内所有的完数。

    输出格式：
            其间所有的完数，以空格分隔，最后一个数字后面没有空格。如果没有，则输出一个空行。
 */
import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for (int i = n;i<m;i++){
            if (PerfectNumber(i)==i){
                count++;  //记录一下在[n,m]范围内所有完数的个数，可以利用count进行格式化输出
            }
        }
        for (int i =n;i<m;i++){
            if (PerfectNumber(i)==i){
                System.out.print(i);
                if (count!=1)
                    System.out.print(" ");
                count--;
            }
        }

    }
    /*
        使用一个方法来完成对完数的判断
            判断条件很简单：
                一个正整数的因子是所有可以整除它的正整数 ==> 先判断整除关系
                而一个数如果恰好等于除它本身外的因子之和，这个数就称为完数 ==> 在进行求和，如果和的结果 = 这个正整数就是完数

     */
    public static int PerfectNumber(int i){
        int sum = 0;
        for (int j=1;j<i;j++){
            if (i%j ==0){
                sum +=j;
            }
        }
        return sum;
    }
}
