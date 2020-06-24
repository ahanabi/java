package com.zrj.java;

/**
 * @author Ahanabi
 * @create 2020-06-23 21:48
 */

public class Order {

    private int orderPrivate;
    int orderDefault;
    public int orderPublic;


    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
    void methodDefault(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
    public void methodPublic(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

}
