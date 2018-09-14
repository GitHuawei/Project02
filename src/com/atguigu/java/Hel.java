package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author intelligent
 * @create 2018-09-13 18:51
 */
public class Hel {

    public static void main(String[] args) {

        int num1 = 10;

        System.out.println();
        System.out.println("Hel.main");
        System.out.println("args = " + args);
        System.out.println(num1);

        System.out.println("Hel.main");

        System.out.println("num1 = " + num1);

        System.out.println(num1);

            String[] str = new String[]{"李磊","韩梅梅"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        for (String s : str) {
            System.out.println(s);
        }

        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            
        }

        List<String> list = new ArrayList<>();

        if (list == null) {

        }

        if (list != null) {

        }

        Customer customer = new Customer();


        for (String s : list) {
            
        }
        
        }

}
