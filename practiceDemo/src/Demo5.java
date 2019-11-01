import java.util.Scanner;

/*
    实现1!+2!+3!+4!+5!+....+n!
    n！为n的阶乘 等于 1 * 2 * 3 * 4.......* n

    思路：
        外层循环控制范围，1-n
        内层循环依次求外层范围中每一个值的阶乘
        内层循环结束就做一次累加。

        如何求阶乘：3！=1x2x3; 4! = 1x2x3x4; 规律很简单


 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        int save = n;
        int sum = 0;  //求和变量
        for (; n >= 1; n--) {
            int x = 1;
            for (int i = n; i >= 1; i--) {
                x = x * i;
            }
            sum = sum + x;
        }
        System.out.println("1-" + save + "的阶乘和等于:" + sum);
    }
}
