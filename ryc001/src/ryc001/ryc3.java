package ryc001;

import java.util.Scanner;
public class ryc3 {
    public static void main(String[] args) {
    	int a,b,c;
    	Scanner scan = new Scanner(System.in);
    	System.out.println("������������");
    	a = scan.nextInt();
    	b = scan.nextInt();
    	c = scan.nextInt();
    	System.out.println("���ֵΪ��" + getMax(c, getMax(a, b)));
    	}
    private static int getMax(int x,int y){
    return x > y ? x : y;
    }
}

