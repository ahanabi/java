package ryc001;

public class ryc {
	public static void main(String args[]){
		int gewei,shiwei,baiwei,sum;
		System.out.println("100-1000之间的水仙花数:");
		for(int i=100;i<=1000;i++){
			sum = 0;
			gewei = i%10;
			shiwei = (i/10)%10;
			baiwei = i/100;
			sum = gewei*gewei*gewei+shiwei*shiwei*shiwei+baiwei*baiwei*baiwei;
			if(sum == i){
				System.out.print(i+" ");
			}
		}
	}
}