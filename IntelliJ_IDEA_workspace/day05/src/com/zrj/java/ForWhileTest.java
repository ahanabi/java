package com.zrj.java;

import java.util.Scanner;

/**
 * @author Ahanabi
 * @create 2020-06-09 21:18
 */
/*
题目：
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。

说明：
1. 不在循环条件部分限制次数的结构：for(;;) 或 while(true)
2. 结束循环有几种方式？
     方式一：循环条件部分返回false
	 方式二：在循环体中，执行break
*/


public class ForWhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        do {
            System.out.println("请输入");
            num = scan.nextInt();
        }while (num == 0);
    }
}
