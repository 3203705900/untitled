package interface2;

public class test {
    public static void main(String[] args){
        //掌握接口新增的三种方法
        B b=new B();
        b.test1();
       A. test3();
    }

}
 interface A{
     /**
      * 1.默认方法：必须使用default修饰，默认会被public修饰
      * 实例方法：对象的方法，接口不能创建对象，必须使用实现类的对象来访问
      */
    default  void test1(){
        System.out.println("====默认的方法====");
test2();
    }
     /**
      * 2.私有方法：必须使用private修饰（jdk9才开始支持）
      *实例的方法：对象的方法，私有方法只能在接口里面访问或在其他私有方法里访问
      */
     private void test2(){
         System.out.println("===私有的方法===");
     }
     /**
      * 3.静态方法：必须使用static修饰,默认使用public进行修饰
      */
     public static void test3(){
         System.out.println("===静态方法===");

     }
     void test4();
        interface a extends b, c{

        }
         interface b{
            void test5();

        }
     interface  c{
            void test6();
     }
     class d implements a{

         @Override
         public void test5() {

         }

         @Override
         public void test6() {

         }
     }
 }
