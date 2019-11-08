/*
    二进制的前导的零:
        题目内容：
        计算机内部用二进制来表达所有的值。一个十进制的数字
        比如18，在一个32位的计算机内部被表达为00000000000000000000000000011000。
        可以看到，从左边数过来，在第一个1之前，有27个0。我们把这些0称作前导的零。

        现在，你的任务是写一个程序，输入一个整数，输出在32位二进制表达下它前导的零的个数。

        输入0就有32个0
        输入负数的话，负数的补码最高位为1，所有有0个0

        利用逻辑右移,右移到输入的数为0时,记录移动了几次,32减去移动的次数就是前面有多少位0
 */
import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 0)
        {
            System.out.print("32");
        }
        if (a < 0) {
            System.out.print("0");
        }
        int i = 0;
        if(a>0) {
            while (a != 0) {
                i++;
                a = a >> 1;
            }
            System.out.print(32 - i);
        }
    }
}
