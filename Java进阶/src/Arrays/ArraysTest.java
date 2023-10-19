package Arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysTest {
    public static void main(String[] args){
        //1.public static String toString(类型[] arr),返回数组内容
        int [] arr={10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        //2.拷贝数组，包前不包后
        int [] arrs=Arrays.copyOfRange(arr,1,4);
        System.out.println(Arrays.toString(arrs));
        //3拷贝数组，可以指定新的数组长度
        int [] arr2=Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr2));
        //4.把数组原数据改为新数据又存进去
        double [] prices={80,120,100};
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value]*0.8;
            }
        });
        System.out.println(Arrays.toString(prices));
        //5.对数组进行排序
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
    }
}
