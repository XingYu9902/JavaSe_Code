/*
    判断一个数是不是质数。
 */
import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        boolean isZhiShu = true;
        for (int i =2;i<number;i++){
            if (number%i ==0)
            {
                isZhiShu = false;
                break;
            }
        }
        if (isZhiShu){
            System.out.println(number+"是质数");
        }else {
            System.out.println(number+"不是质数");
        }
    }
}
