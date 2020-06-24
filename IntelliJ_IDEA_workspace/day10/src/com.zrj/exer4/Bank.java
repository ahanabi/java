package com.zrj.exer4;

/**
 * @author Ahanabi
 * @create 2020-06-24 10:45
 */
public class Bank {
    private Customer[] customers;
    private int numberofCustomers;

    public Bank(int numberofCustomers) {
//        this.numberofCustomers = numberofCustomers;
        customers = new Customer[numberofCustomers];
    }
    public void addCustomer(String f, String l){
        Customer cust = new Customer(f,l);
        customers[numberofCustomers] = cust;
        ++numberofCustomers;
    }
    public int getNumberofCustomers(){
        return numberofCustomers;
    }
    public Customer getCustomer(int index){
        return customers[index];
    }

}

//
//public class Bank {
//
//    private Customer[] customers;// 存放多个客户的数组
//    private int numberOfCustomers;// 记录客户的个数
//
//    public Bank() {
//        customers = new Customer[10];
//    }
//
//    // 添加客户
//    public void addCustomer(String f, String l) {
//        Customer cust = new Customer(f, l);
//         customers[numberOfCustomers] = cust;
//         numberOfCustomers++;
////         或
////        customers[numberOfCustomers++] = cust;
//    }
//
//    // 获取客户的个数
//    public int getNumOfCustomers() {
//        return numberOfCustomers;
//    }
//
//    // 获取指定位置上的客户
//    public Customer getCustomer(int index) {
//        // return customers[index];//可能报异常
//        if (index >= 0 && index < numberOfCustomers) {
//            return customers[index];
//        }
//
//        return null;
//    }
//
//}

