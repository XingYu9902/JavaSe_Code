import java.util.Scanner;

/*
    题目内容：
    每个非素数（合数）都可以写成几个素数（也可称为质数）相乘的形式，这几个素数就都叫做这个合数的质因数。
    比如，6可以被分解为2x3，而24可以被分解为2x2x2x3。
    现在，你的程序要读入一个[2,100000]范围内的整数，然后输出它的质因数分解式；当读到的就是素数时，输出它本身。

    1.首先先判断输入的数是不是素数，如果是素数就直接输出。

    2.如果输入的数不是素数，那么就从第一个素数2开始找，比如18
        18 = 2*9; 9用2已经找不到质因数了，所以要继续从3找 = 2*(3*3) 3/3 = 1 n=1不满足循环条件，结束
        24 = 2*12; = 2*(2*6) = 2*（2*（2*3））
 */
public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2;i<n; i++){
            if (n%i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(n+"="+n);
        }
        else{
            System.out.print(n+"=");
            int num = 2;
            while (n>=num) {
                while (n % num == 0) {
                    System.out.print(num);
                    n = n / num;
                    if (n / num != 0) {  //如果n/num为0时，就说明n<num，已经找出所有的质因数了
                        System.out.print("x");
                    }
                }
                num++;
            }
        }
    }
}
