/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-04 15:38
 */
public class AirExer {
    public static void main(String[] args) {
        int a= 987;


        int b=a%100;
        int d = b/10;


        int c = a%10;

        int e = a/100;
        System.out.println("百位为："+e);
        System.out.println("十位为："+d);
        System.out.println("各位为："+c);
    }
}
