package 继承;

public class Test {
    public static void main(String[] args ){
        Teacher t=new Teacher();
        t.setName("小马云");
        t.setSkill("开挖掘机");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        t.printinfo();
        t.print();

    }

}
