package ryc001;
import java.util.Arrays;
import java.util.Scanner;
public class ryc5 {
	public static void main(String[] args){
	    int[] array = new int[10];
	    Scanner s = new Scanner(System.in);
	    for (int i = 0;i<10;i++){
	        array[i] = s.nextInt();
	    }
	    Arrays.sort(array);
	    System.out.print("���ֵ��"+array[9]);
	    System.out.print("��Сֵ��"+array[0]);
	}
}

