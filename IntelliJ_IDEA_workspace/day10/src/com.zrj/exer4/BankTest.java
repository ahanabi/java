package com.zrj.exer4;

/**
 * @author Ahanabi
 * @create 2020-06-24 10:45
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank(100);
//        Customer cust = new Customer("12","34");

        bank.addCustomer("周","仁杰");
        bank.getCustomer(10);
        bank.getCustomer(0).setAccount(new Account(5000));
        bank.getCustomer(0).getAccount().withdraw(500);
        double b = bank.getCustomer(0).getAccount().getBanlance();
        System.out.println("b = " + b);
    }
}

//public class BankTest {
//    public static void main(String[] args) {
//
//        Bank bank = new Bank();
//
//        bank.addCustomer("Jane", "Smith");
//
//        //连续操作
//        bank.getCustomer(0).setAccount(new Account(2000));
//
//        bank.getCustomer(0).getAccount().withdraw(500);
//
//        double balance = bank.getCustomer(0).getAccount().getBanlance();
//        System.out.println("客户：" + bank.getCustomer(0).getFirstname() + "的账户余额为：" + balance);
//
//        System.out.println("***********************");
//        bank.addCustomer("万里", "杨");
//
//        System.out.println("银行客户的个数为：" + bank.getNumOfCustomers());
//
//
//    }
//}

