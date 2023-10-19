package 常用api;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class tostring {
    public static void main(String[] args){
//        Student s1=new Student("张三",18);
//        System.out.println(s1);
//        Student s2=new Student("张三",18);
//        System.out.println(s2.equals(s1) );
//        System.out.println(s1==s2);
          String s1=null;
          String s2="ai";
        //System.out.println(s1.equals(s2));   因为null报空指针异常
        System.out.println(Objects.equals(s1,s2));
        System.out.println("-----------------");

        //包装类继承object类
        Integer a=Integer.valueOf(12);
        System.out.println(a);
        //自动装箱：可以自动把基本类型的数据转换成对象
        Integer a1=3;
        //自动拆箱：可以自动把包装的对象转换成对应的类型
        int a2=a1;
        System.out.println(a2);
        //泛型不支持基本类型，只能支持引用类型
        ArrayList<Integer> list =new ArrayList<>();
        list.add(13);//自动装箱
        list.add(140);
        int rs=list.get(0); //自动拆箱
        System.out.println(rs);

        //把基本类型的数据转化为字符串
        Integer b=23;
        String s=Integer.toString(b);//"23
        System.out.println(s+1);

        String b1=a.toString(b);
        System.out.println(s+1);

        String s3=23+"";
        System.out.println(s3);
        System.out.println("+++++++++++++");
        //把字符串类型转换为对应的基本类型
        String q="111";
        String q3="99.5";
        int q1=Integer.valueOf(q);
        System.out.println(q1+1);
        double q2=Double.valueOf(q3);
        System.out.println(q2+3);
        System.out.println(Math.max(10,20));
        long time =System.currentTimeMillis();  //返回long类型的时间毫秒值。从1970-1-1 0：0：0开始走到此时的总毫秒值
        for (int i = 0; i <1000000;i++) {
            System.out.println(i);
        }
        long time1= System.currentTimeMillis();
        System.out.println((time1-time)/1000.0+"s");



    }

}
