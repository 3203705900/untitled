package 静态代码块和实例代码块;

public class student {
    static  int number=80;
    static String name;
    //静态代码块,类加载时只执行一次，所以静态代码块也只执行一次；作用完成类变量的初始化
    static{
        System.out.println("静态代码块执行了");
        name="代龙福";
    }
}
