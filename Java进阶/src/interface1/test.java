package interface1;

import org.w3c.dom.ls.LSOutput;

public class test {
    public static void main(String[] args){
            Singer s=new A();
            s.singer();
    }
}
class A extends Student implements Driver,Singer {

    @Override
    public void driver() {

    }

    @Override
    public void singer() {
        System.out.println("我爱唱歌");

    }
}
class Student{

}
interface Driver{
  void driver();


}
interface Singer{
    void singer();

}

