package com.zrj.java;

/**
 * @author Ahanabi
 * @create 2020-06-09 19:28
 */
/*
do-while循环的使用

一、循环结构的4个要素
① 初始化条件
② 循环条件  --->是boolean类型
③ 循环体
④ 迭代条件

二、do-while循环结构：

①
do{
	③;
	④;

}while(②);

执行过程：① - ③ - ④ - ② - ③ - ④ - ... - ②

说明：
1.do-while循环至少会执行一次循环体！
2.开发中，使用for和while更多一些。较少使用do-while

*/
//遍历100以内的偶数,并计算所有偶数的和及偶数的个数
class DoWhileTest {
    public static void main(String[] args) {
        Integer interger = new Integer(0);
        int num = interger.intValue();
        int sum = 0;
        int total = 0;
        do {
            if ( num % 2 == 0)
                sum += num;
                total++;

            num++;
        } while (num < 101);
        System.out.println("total = " + total);
        System.out.println("sum = " + sum);
        System.out.println("num = " + num);

    }


}

/*
        int num = 1;
        int sum = 0;//记录总和
        int count = 0;//记录个数
        do{

            if(num % 2 == 0){
                System.out.println(num);
                sum += num;
                count++;
            }

            num++;

        }while(num <= 100);


        System.out.println("总和为：" + sum);
        System.out.println("个数为：" + count);

        //*************体会do-while至少执行一次循环体***************
        int number1 = 10;
        while(number1 > 10){
            System.out.println("hello:while");
            number1--;
        }

        int number2 = 10;
        do{
            System.out.println("hello:do-while");
            number2--;
        }while(number2 > 10);

    }
}*/