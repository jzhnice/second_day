/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-05 18:20
 */


/** 分支结构中的if-else（条件判断结构）
 *
 * 一、三种结构
 * 第一种
 * if(条件表达式){
 * }
 *
 *
 *第二种：二选一
 * if(条件表达式){
 *     执行表达式
 * } else{
 *     执行表达式
 * }
 *
 *
 * 第三种  n选1
 * if(条件表达式){
 *  *     执行表达式
 *  * } else if(条件表达式){
 *      执行表达式2
 *  }else if(条件表达式){
 *      执行表达式3
 *  }
 *  ...
 *  else{
 *      执行表达式n
 *  }
 *
 *
 * */
public class IfTest {
    public static void main(String[] args) {
        //举例一
        int heartBeats = 79;
        if(heartBeats < 60 || heartBeats >100 ){
            System.out.println("需要进一步检查");
        }
        System.out.println("检擦结束");

        //举例二
        int age = 23;
        if(age <18){
            System.out.println("你还可以看动画片");
        }else {
            System.out.println("你可以看电影了");
        }
        //举例三
        if (age < 0){
            System.out.println("您输入的数据非法");
        }else if(age <18){
            System.out.println("青少年时期");
        }else if (age < 35 ){
            System.out.println("青壮年时期");
        }else if (age <60){
            System.out.println("中年时期");
        }else if (age  < 120){
            System.out.println("老年时期");
        }else {
            System.out.println("你是要成仙啊");
        }


    }
}
