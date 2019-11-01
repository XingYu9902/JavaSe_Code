/*
    打印1-100之间所有7的倍数的个数及总和
 */
public class Demo7 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("所有7的倍数的个数为：" + count);
        System.out.println("所有7的倍数的总和为：" + sum);
    }
}
