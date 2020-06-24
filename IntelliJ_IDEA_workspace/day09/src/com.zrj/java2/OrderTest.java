package com.zrj.java2;

/**
 * @author Ahanabi
 * @create 2020-06-23 22:07
 */

import com.zrj.java.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderPublic = 2;
        // 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
//		order.orderDefault = 1;
        // order.orderPrivate = 3;//The field Order.orderPrivate is not visible

        order.methodPublic();
        // 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
//		order.methodDefault();
        // order.methodPrivate();//The method methodPrivate() from the type Order is not visible
    }
}
