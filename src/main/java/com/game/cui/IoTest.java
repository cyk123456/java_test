package com.game.cui;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IoTest {
    public static void main(String[] args) {

        IoTest m = new IoTest();
        List<Integer> io_data = IoTest.readFiles();
        int[] index = IoTest.getInd(io_data);
    }

    public static int[] getInd(List<Integer> args){

        int total = 11;
        int b;
        int c;
        int sum;
        int flag = 0;
        //System.out.println(args.size());
        for (int i = 0; i < args.size(); i++)
        {
            for (int j = 0; j < args.size(); j++)
            {

                if(i == j || i> j)
                {
                    continue;
                }
                //  System.out.println("Index: " + j + " - Item: " + args.get(j));
                b = args.get(i);
                c = args.get(j);
                sum = b + c;
                if(sum == total)
                {
                    System.out.println("Index: " + i + " - Item: " + b);
                    System.out.println("Index: " + j + " - Item: " + c);
                    System.out.println("****************************");
                    flag = 1;
                }
            }
        }
        if(flag == 0)
        {
            System.out.println("没有找到相加的两个值");
        }
        return new int[0];
    }


    public static List<Integer> readFiles(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        String path = "./io_test.txt";
       // System.out.println(System.getProperty("user.dir"));
        File f = new File(path);
        System.out.println(f.getName());
        try {
            FileReader finput = new FileReader(f);
            BufferedReader br = new BufferedReader(finput);
            String line;

            while((line=br.readLine())!=null)
            {
                int i =  Integer.parseInt( line );
                list.add(i);
            }
            //System.out.println(list);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
