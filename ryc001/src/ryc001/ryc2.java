package ryc001;

import java.util.*;
import java.util.Scanner;
public class ryc2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入3个整数:");
		System.out.println("第一个整数a");
		int a = scanner.nextInt();
		System.out.println("第二个整数b");
		int b = scanner.nextInt();
		System.out.println("第三个整数c");
		int c = scanner.nextInt();
		int[] i = new int[3];
		i[0] = a;
		i[1] = b;
		i[2] = c;
		System.out.println("a*b*c=" + i[0] * i[1] * i[2]);
	}
}