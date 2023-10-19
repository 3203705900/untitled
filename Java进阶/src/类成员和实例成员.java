public class 类成员和实例成员 {
    static String name;//类变量
    double score;//实例变量
    //1.类方法可以直接访问类的成员，不可以直接访问实例变量
    public static void main(String[] args) {
        name="dailongfu";
        print();
       // score=66;报错
       // System.out.println(this);//报错
       类成员和实例成员 a= new 类成员和实例成员();
       a.print2();
    }
    //类方法
    public static void print(){


    }
//2.实列方法可以直接访问实例成员和类成员
    //3.实例方法中可以出现this关键字，而类方法中不行
    public  void print2(){
        name="小帅";
        score=76;
        print();
        System.out.println(score);

    }
}