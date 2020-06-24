package ryc001;

import java.util.Scanner;
public class ryc3 {
    public static void main(String[] args) {
    	int a,b,c;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("请输入三个数");
    	a = scan.nextInt();
    	b = scan.nextInt();
    	c = scan.nextInt();
    	System.out.println("最大值为：" + getMax(c, getMax(a, b)));
    	}
    private static int getMax(int x,int y){
    return x > y ? x : y;
    }
}

