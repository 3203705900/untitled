package 内部类;

public class Outer {
   private int age =99;
    public static String a;
    public class Inner{
        private String name;
        public static String schoolname;                 //jdk16开始才支持定义静态成员的
        private int age=88;
        public void test(){
            System.out.println(age);
            System.out.println(a);
            int age=66;
            System.out.println(age);//66
            System.out.println(this.age);//88
            System.out.println(Outer.this.age);//99


        }

    }

}
