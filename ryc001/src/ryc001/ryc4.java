package ryc001;

import java.util.Scanner;
public class ryc4 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("请输入:");
        int a=scan.nextInt();
        int thousand=a/1000;
        int hundred=(a-thousand*1000)/100;
        int ten=(a-thousand*1000-hundred*100)/10;
        int last=a-thousand*1000-hundred*100-ten*10;       
        System.out.println("结果为："+ten+last+thousand+hundred);
    }     
}
