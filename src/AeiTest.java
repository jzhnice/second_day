/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-03 16:54
 */

/**
 * 运算符之一：算术运算符
 * + - * / % (前)++ (后)++ (前)-- (后)--
 *
 * */
public class AeiTest {
    public static void main(String[] args) {

        // 除号: /
        int num1 = 12;
        int num2 = 5;
        int result1 = num1/num2;
        System.out.println(result1);
        // 2
        int result2  = num1/ num2*num2;
        System.out.println(result2);
        // 10
        double result3 = num1/num2;
        System.out.println(result3);
        //2.0
        double result4 = num1 / num2+ 0.0 ;
        System.out.println(result4);
        // 2.0
        double result5 = num1 / (num2+ 0.0) ;
        System.out.println(result5);
        //2.4
        double result6 = (double)num1 / num2;
        System.out.println(result6);
        // 2.4
        double result7 = (double)(num1 / num2);
        System.out.println(result7);
        // 2.0

        /**      % 取余运算
         *       结果的符号与被模数的符号相同
         *       开发中，经常使用%来判断是否能被除尽的情况
         *
         * */

        int m1 = 12;
        int n1 = 5;
        System.out.println("m1%n1=" + m1 % n1 );

        int m2 = -12;
        int n2 = 5;
        System.out.println("m1%n1=" + m2 % n2 );

        int m3 = 12;
        int n3 = -5;
        System.out.println("m1%n1=" + m3 % n3 );

        int m4 = -12;
        int n4 = -5;
        System.out.println("m1%n1=" + m4 % n4 );




        /**     (前)++   先自增1，然后再运算                   */
        /**     (后)++   先运算，后自增1               */
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1="+a1 + ",b1="+ b1 );

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2="+a2 + ",b2="+ b2 );

        short s1 = 10;
//        s2 = s1+1;
//        s2 = (short)(s1+1);
        s1++ ;// 自增1不会改变本身变量的数据类型
        System.out.println(s1);
        byte b3 = 127;
        b3++ ;
        System.out.println("b3="+b3);
        //因为byte的上线是127再加1就变成了-128
        //计算机使用的二进制 127就是除了第一位是0以外别的都是1，再加1就是第一位是1别的都是0
        




        /**     (前)--       先自减一，后运算          */
        /**     (后)--     先运算，后自减1             */
        int a4 = 10;
        int b4 = --a4;
        System.out.println(a4+ "b4="+b4);
        int b5 = a4--;
        System.out.println(b5);
    }
}
