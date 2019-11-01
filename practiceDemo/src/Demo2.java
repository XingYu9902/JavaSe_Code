/*
    求斐波那契数列，显示到20位即可：
        第一位：1
        第二位：1
        第三位：2
        第四位：3
        第五位：5
        第六位：8
        规律：从第三位开始，每一位等于前两位之和。
        第三位(c) = 第一位(a) + 第二位(b) = 1 + 1;

        第四位(c) = 第二位(a) + 第三位(b) = 2 + 1;
        以此类推，可以看出很明显的赋值关系。
 */
public class Demo2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = a + b;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 1; i <= 17; i++) { // i控制循环次数20次
            a = b;
            b = c;
            c = a + b;
            System.out.print(c + " ");
        }
    }
}
