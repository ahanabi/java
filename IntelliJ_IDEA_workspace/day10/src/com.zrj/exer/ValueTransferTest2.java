package com.zrj.exer;

/**
 * @author Ahanabi
 * @create 2020-06-23 21:13
 */

public class ValueTransferTest2 {

    public static void main(String[] args) {

        Data data = new Data();
        String s = new String();
        String[] s1 = new String[10];

        data.m = 10;
        data.n = 20;

        System.out.println("m = " + data.m + ", n = " + data.n);

        //交换m和n的值
//		int temp = data.m;
//		data.m = data.n;
//		data.n = temp;

        ValueTransferTest2 test = new ValueTransferTest2();
        test.swap(data);


        System.out.println("m = " + data.m + ", n = " + data.n);

    }

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

}

class Data{

    int m;
    int n;

}
