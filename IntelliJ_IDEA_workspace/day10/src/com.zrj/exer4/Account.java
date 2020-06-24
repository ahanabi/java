package com.zrj.exer4;

/**
 * @author Ahanabi
 * @create 2020-06-24 10:44
 */
public class Account {
    private double banlance;
    public Account(double banlance){
        this.banlance = banlance;
    }
    public double getBanlance(){
        return banlance;
    }

    public double deposit(int money){
        if (money <= 0)
            System.out.println("请存正数");
        else if(money > 0)
            banlance += money;
        return banlance;
    }
    public void withdraw(int money){
        if(money >= banlance)
            System.out.println("余额不足");
        else
            banlance -= money;

    }
}









