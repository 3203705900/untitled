package GUI编程;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args ){
        //搞明白匿名内部类在开发中的真实使用场景
        //GUI编程
        //1.创建窗口
        JFrame win=new JFrame("登录界面");   //窗口
        JPanel panel=new JPanel();              //加一个桌布
        win.add(panel);                         //把桌布加到窗口上去

        JButton btn=new JButton("登录");        //按钮
        panel.add(btn);                       //把按钮放到桌布上去
        /*//给按钮绑定单击事件监听器
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"！！！！");
            }
        });
        //核心目标简化代码*/


        btn.addActionListener(e ->JOptionPane.showMessageDialog(win,"！！！！") );      //纳米大表达式
        win.setSize(400,400);                   //设置窗口大小
        win.setLocationRelativeTo(null);                   //居中
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);       //关闭窗口退出程序
        win.setVisible(true);                //让它可见，显示出来

    }
}
