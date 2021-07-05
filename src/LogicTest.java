/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-04 16:41
 */


/**
 * 运算符之四：逻辑运算符
 * & && | ||  ^
 *
 * 说明：
 * 1.逻辑运算符操作的都是Boolean类型的变量
 *
 *
 *  */
public class LogicTest {
    public static void main(String[] args) {

        //区分& 与 &&
        // 相同点1： & 与 && 的运算结果相同
        // 相同点2：当符号左边是true是，他们二者都会执行符号右边的运算
        // 不同点：当符号左边是false是，&会执行符号右边的运算 .&&不在执行符号右边的运算
        // 开发中 推荐使用 &&
        boolean b1 = false;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("现在我在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println(num1);



        boolean b2 = false;
        int num2 = 10;
        if(b2 && (num2++ > 0)){
            System.out.println("现在我在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println(num2);


        //区分| 与 ||
        // 相同点1： | 和||运算结果相同
        // 相同点2： 当符号左边是false时，两者都会执行符号右边的运算
        // 不同点1： 当符号左边是 true 时，|会执行符号右边的运算 ||不在执行符号右边的运算
// 开发中 推荐使用 ||
        boolean b3= true;
        int num3 = 10;
        if(b3 | (num3++ > 0)){
            System.out.println("现在我在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println(num3);



        boolean b4= true;
        int num4 = 10;
        if(b4 || (num4++ > 0)){
            System.out.println("现在我在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println(num4);

    }


}
