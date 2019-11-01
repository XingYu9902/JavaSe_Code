/*
    有一个棋盘，有64个方格，在第一个方格里面放1粒芝麻重量是0.00001kg
    第二个里面放2粒，第三个里面放4粒，求棋盘上放的所有芝麻的重量

        一个简单的倍数关系。一共64个格子，每一个格子重量都是前一个格子重量的2倍，然后求和即可。
 */
public class Demo3 {
    public static void main(String[] args) {
        double weight = 0.00001;
        double sumWeight = 0;
        for (int i = 1; i<=64;i++){
            sumWeight = sumWeight + weight;
            weight *= 2;
        }
        System.out.println("所有芝麻的重量："+sumWeight+" kg");
    }
}
