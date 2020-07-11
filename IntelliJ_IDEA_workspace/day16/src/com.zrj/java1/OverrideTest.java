package com.zrj.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 方法重写的规则之一：
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 *
 */
public class OverrideTest {

    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.display(new SubClass());
    }


    public void display(SuperClass s) {
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SuperClass {

    public void method() throws IOException {

    }


}

class SubClass extends SuperClass {
    public void method() throws IOException {
        File file = new File("hello1.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while(data != -1){
            System.out.print((char)data);
            data = fis.read();
        }

        fis.close();
    }
}
