package BigDecimal;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args){
        double a=0.1;
        double b=0.2;
        System.out.println(a+b);
        System.out.println("********************************");

        //把他们他们变成字符串来封装成BigDecimal对象来运行
        BigDecimal a1=BigDecimal.valueOf(a);
        BigDecimal b1=BigDecimal.valueOf(b);
        BigDecimal c=a1.add(b1);//加
        BigDecimal c1=a1.subtract(b1); //减
        BigDecimal c2=a1.multiply(b1); //乘
        BigDecimal c3=a1.divide(b1); //除
        System.out.println(c3);

    }
}
