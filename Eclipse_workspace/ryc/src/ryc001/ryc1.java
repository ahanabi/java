package ryc001;
import java.util.Scanner;
public class ryc1 {
	
	public static void main(String[] args) {
		final float PI = 3.14f;
		System.out.print("输入圆半径：");
		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();
		float circumference = 2*PI*radius;
		float square = PI*radius*radius;
		
		System.out.println("周长为" + circumference +"。");
		System.out.println("面积为" + square + "。\n");							
	}
}