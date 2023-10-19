package 常用api;

import java.awt.*;
import java.io.IOException;

public class RunTimeTest {
    public  static void main(String[] args) throws IOException, InterruptedException {
        //1.public static Runtime getRuntime();  返回与当前java应用程序相关联的运行时对象
        Runtime a=Runtime .getRuntime();
        //2.public void exit(int status) 终止当前的虚拟机，该参数作为返回状态码；按照惯例非零状态代码表示异常终止
        //a.exit(0)
        //3.public int availableProcessors()  获得虚拟机能够使用的处理器数
        System.out.println(a.availableProcessors());
        //4.public long totalMemory() 返回Java虚拟机中的内存总量（字节）
        System.out.println(a.totalMemory()/1024.0/1024.0+"mb");
        //5.public long freeMemory()  返回虚拟机中可用内存量
        System.out.println(a.freeMemory()/1024.0/4201.0+"mb");
        //6.public Process exec(String command)  启动某个程序，并返回代表该程序的对象

       Process p= a.exec("D:\\BaiduNetdisk\\baidunetdisk.exe");
       Thread.sleep(5000);//让程序暂停5秒再走
        p.destroy();//销毁，关闭程序
    }
}
