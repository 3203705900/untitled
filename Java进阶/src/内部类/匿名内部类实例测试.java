package 内部类;

public class 匿名内部类实例测试 {
    public static void main(String[] args){
      /* Swimming s1= new Swimming(){
           @Override
           public void swim() {
               System.out.println("狗游得很快~~~~~~~~~~");

           }
       };
       go(s1);
*/
        go(new Swimming(){
            @Override
            public void swim() {
                System.out.println("狗游得很快~~~~~~~~~~");

            }
        });
    }
    //设计一个方法，可以接受Swimming接口一切实现类对象进来参加游泳比赛
    public static void go(Swimming s){
        System.out.println("--------开始---------");
        s.swim();
    }

}
interface Swimming{

     void swim();



}
