package com.game.cui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;


public class MyGameFrame extends JFrame {
    public static int a;
    public static void main(String[] args) {
//        MyGameFrame g = new MyGameFrame();
//        g.cuiFrame();
//
//        MyGameFrame m = new MyGameFrame();
//
//        String[] myList = m.setarr();
//
//        int[] a = {1,56,34,55,3,55};
//        System.out.println(Arrays.toString(myList));
//
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);
//
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.binarySearch(myList,"市"));
        String str = "/browse/c0-equipment/c1-darts/_/N-bgtnu";
        String oriName = str .substring(str .lastIndexOf("/")+1);
        System.out.println(oriName);


    }

    public static void printarr(double[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);        }
    }

    public static String[] setarr() {
        // 数组大小
        int size = 10;
        // 定义数组
        String[] myList = new String[size];
        myList[0] = "cui";
        myList[1] = "yong";
        myList[2] = "kun";
        myList[3] = "安";
        myList[4] = "徽";
        myList[5] = "省";
        myList[6] = "淮";
        myList[7] = "北";
        myList[8] = "市";
        myList[9] = "铁佛镇茂铺村";
        return  myList;
    }


    int x = 0;
    int y = 0;
    Image user = GameUtil.getImage("images/panel-user.png");


    @Override
    public void paint(Graphics g) {//自动被调用   g是一个画笔
        g.drawImage(user,x,y,null);
        x++;
    }

    class paintThread extends Thread{
        @Override
        public void run() {
            while (true){
//                System.out.println("动图来了");
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public  void cuiFrame(){
        this.setTitle("崔永坤的游戏作品");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(300,300);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosed(e);
                System.exit(0);
            }
        });
        a = 100;
        System.out.println(a);
        new paintThread().start();
    }


}
