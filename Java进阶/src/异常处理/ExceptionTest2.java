package 异常处理;

import java.util.Scanner;
/*
捕获异常，尝试修复
 */
public class ExceptionTest2 {
    public static void main(String[] args){
        while (true) {
            try {
                System.out.println(GetMoney());
                break;
            } catch (Exception e) {
                System.out.println("请你的输入合法的数字！！！");
            }
        }

    }
    public static double GetMoney(){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入合适的价格：");
            double money =sc.nextDouble();
            if(money>=0){
                return money;
            }
            else
                System.out.println("你输入的价格不合适！");
        }
    }
}

