/*
    一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Main {
    public static void main(String[] args) {
        double high = 100;
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + high;    //累加每一次下降的高度
            high = high / 2;  //每次落地后返回原来高度的一半
            sum = sum + high;
        /*
            累加每一次返回的高度，有一个2倍关系
            1.下降100米，返回50米
            2.下降50米，返回25米
            3.下降25米，返回17.5米
            ...等到最后一次，落下就不再返回了，所以再减去最后一次的下降高度
         */
        }
        sum = sum - high;   //减去最后一次下降的高度，因为不在返回了。
        System.out.println("小球在第10次落地时共经过：" + sum + "米");
        System.out.println("第10次反弹：" + high + "米");
    }

}
