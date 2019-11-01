/*
    输出1-100之间所有的质数

    什么是质数？
            除了1和它本身外，不能被任何数整除。

            比方说 2除了1和2之外，不能被任何数整除，所以2是质数。
                  而4/2 = 2  4可以被2整除，所以4不是质数。
 */
public class Demo8 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            boolean isZhiShu = true;
            for (int j = 2; j<i;j++){
                if (i%j ==0){
                    isZhiShu = false;
                    break;
                }
            }
            if(isZhiShu){
                System.out.println(i+"是质数");
            }
        }

    }
}
