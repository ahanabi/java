package ryc001;

import java.util.*;
import java.util.Scanner;
public class ryc2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������3������:");
		System.out.println("��һ������a");
		int a = scanner.nextInt();
		System.out.println("�ڶ�������b");
		int b = scanner.nextInt();
		System.out.println("����������c");
		int c = scanner.nextInt();
		int[] i = new int[3];
		i[0] = a;
		i[1] = b;
		i[2] = c;
		System.out.println("a*b*c=" + i[0] * i[1] * i[2]);
	}
}