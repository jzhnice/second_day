/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-05 17:34
 */


/** 运算符之六: 三元运算符
 *  1.结构：(条件表达式) ？ 表达式1 ： 表达式2
 *  2.说明
 *  条件表达式的结果为boolean类型
 *
 *  根据条件表达式的真货架，决定执行表达式1，还是表达式2
 *  如果表达式位true，则执行表达式1
 *  如果表达式位false,则执行表达式2
 *
 *  表达式1和表达式2 要求是一致的
 *
 *  三元运算符是可以嵌套使用的
 *  3.凡是可以使用三元运算符的地方，都可以使用if-else
 *  反之，不成立
 *
 *  4.如果程序既可以使用三元运算符，又可以使用if-else结构，那么优先选择三元运算符；原因：简洁、执行效率高
 * */
public class sanyuanTest {
    public static void main(String[] args) {
        //获取两个整数的较大值
        int m = 12;
        int n = 5;


        int max = (m>n)? m:n;
        System.out.println(max);

        double num = (m>n) ? 2:1.0;
        System.out.println(num);

        //(m > n)? 2:"n大"; 不是表达式
        n = 12;
        String maxstr = (m > n)? "m大":((m == n)? "m和n一样大":"n大");
        System.out.println(maxstr);

        //******************************************************
        // 获取三个书中的最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;

        int max1 = (n1 >n2)?n1 : n2;
        int max2 = (max1 >n3) ?max1:n3;
        System.out.println("三个书中的最大值位 ：" +max2);



        // 不建议这么写
        int max3 = (((n1 >n2)?n1 : n2)> n3)?((n1 >n2)?n1 : n2) : n3;
        System.out.println(max3);


        // 改写为if-else;
        if( m >n){
            System.out.println(m);
        }else{
            System.out.println(n);
        }

    }

}
