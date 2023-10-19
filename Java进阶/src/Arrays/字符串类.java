package Arrays;

import java.util.ArrayList;
import java.util.List;

public class 字符串类 {
    public static void main(String[] args){
        char [] chars1={'A','B','C'};
        char [] chars2={'中','国','Π','@','m','n'};
        var s1=new String(chars1); //用字符数组创建String对象
        var s2=new String(chars2,0,4);
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);

        //
        var str=" java is cool ";
        System.out.println(str.startsWith("j"));          //以某个字符串开头返回true
        System.out.println(str.substring(1,9));        //产生子串，包前不包后
        System.out.println(str.substring(1));   //产生字串 从开始索引找到末尾
        System.out.println(str.toUpperCase());       //把小写字符串转为大写字符串
        System.out.println(str.toUpperCase().toLowerCase());  //把大写字符串转为小写字符串
        System.out.println(str.concat(" and good"));   //把新字符串与原来字符串连接起来
        System.out.println(str.replace("java","张三"));   //用新的字符串代替原来的字符串
        System.out.println(str.charAt(0));   //返回字符串中指定位置的字符，范围0~str.length()-1
        System.out.println(str.length());
        System.out.println("-----------------");
        System.out.println(str.trim());   //返回去掉前后空格的字符串对象
        System.out.println(str.repeat(6));  //重新打印6次字符串
        var str1="";
        System.out.println(str1.isEmpty()); //  true  //空字符串返回true 否则返回false
        var str2="  ";
        System.out.println(str2.isBlank());  //true    //空字符串或空白字符都返回true 否则fasle

        //
        List<String> a=new ArrayList<>();
        a.add("蜘蛛精");
        a.add("至尊宝");
        a.add("牛魔王");
        System.out.println(a);
       a.add(1,"紫霞仙子");  //在某个索引处添加某值
        System.out.println( a);
        System.out.println(a.remove(1));//根据索引删除元素，并返回元素
        System.out.println(a);
        System.out.println(a.set(1,"小丑"));   //修改索引处的元素，修改成功后会返回原来的数据
        System.out.println(a);

    }
}
