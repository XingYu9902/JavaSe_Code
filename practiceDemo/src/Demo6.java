/*
    假设某人有100,000现金.每经过一次路口需要进行一次交费.
    交费规则为当他现金大于50,000时每次需要交5%
    如果现金小于等于50,000时每次交5,000.
    请写一程序计算此人可以经过多少次这个路口

    一道简单的循环判断题，但是有一个很关键的隐含就是当钱不够5000的时候，不要疏忽。
*/
public class Demo6 {
    public static void main(String[] args) {
        int cash = 100000;
        double tax;
        int count = 0;
        while (true) {
            if (cash < 5000) {
                break;
            }
            if (cash > 50000) {
                tax = (int) (cash * 0.05);
                count++;
            } else {
                tax = 5000;
                count++;
            }
            cash = (int) (cash - tax);
            System.out.println("第" + count + "次经过" + "交税" + tax + "元" + "剩余" + cash + "元");
        }
    }
}
