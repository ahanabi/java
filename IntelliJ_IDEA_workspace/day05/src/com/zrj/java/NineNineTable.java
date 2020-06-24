package com.zrj.java;

import com.sun.org.apache.bcel.internal.generic.IFNE;

/**
 * @author Ahanabi
 * @create 2020-06-09 21:28
 */
/*
嵌套循环的应用1：

九九乘法表
1 * 1 = 1
2 * 1 = 2  2 * 2 = 4
。。。
9 * 1 = 9 。。。 9 * 9 = 81


*/
public class NineNineTable {
    public static void main(String[] args) {
        for(int i = 1;i<10;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("i*j"+"="+i*j+" ");
            }
            System.out.println("");
        }

//        for(int i = 1;i <= 9;i++){
//
//            for(int j = 1;j <= i;j++){
//                System.out.print(i + " * " + j + " = " + (i * j) + "  ");
//            }
//
//            System.out.println();
//        }

    }
}
