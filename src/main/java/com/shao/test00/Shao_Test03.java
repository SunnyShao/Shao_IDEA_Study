package com.shao.test00;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther Shao
 * @data 2023/8/29 12:29:54
 * @description
 */

public class Shao_Test03 {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();

        System.out.println("test -0 " + list == null);
        System.out.println("test - 1 ");

        int a= 0;
        for (int i = 0; i < 10; i++) {
            a++;
        }
        test();
    }

    public  static  void  test()
    {
        System.out.println("sddassa ");
    }
}
