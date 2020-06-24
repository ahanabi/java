package ryc002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Input {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个整数：");
		String str = sc.next();
		String aaa = sc.next();
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			bw = new BufferedWriter(new FileWriter("C:\\exp\\file1.dat"));
			bw.write(str);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					bw = null;
				}

			}
		}
	}
}
