package 内部类;

public class 匿名内部类 {
    public static void main(String[] args ){
        //把这个匿名内部类编译成一个子类，然后会立即创建一个子类对象出来
      Animal a=new Animal() {
          @Override
          public void cry() {
              System.out.println("cat is crying！！！");

          }
      };
      a.cry();

    }

}
abstract class Animal{
    public abstract void cry();

}
