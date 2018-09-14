package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HelloWorld {

    private String str;



    public static void main(String[] args) {


        //region Description
        try {
            FileInputStream fis = new FileInputStream(new File("c:\\io\\io1" ));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //endregion

        System.out.println("Hello World !");

    }
}
