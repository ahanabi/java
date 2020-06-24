package com.zrj.java;

/**
 * @author Ahanabi
 * @create 2020-06-23 21:50
 */

public class ValueTransferTest {
    public static void main(String[] args) {

        String s1 = "hello";




        ValueTransferTest test = new ValueTransferTest();
        test.change(s1);

        System.out.println(s1);//hi~~


    }

    public void change(String s){
        s = "hi~~";
    }
}
