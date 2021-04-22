import java.util.Scanner;


//int n = scanner.nextInt();
//        scanner.nextLine();
//1.nextInt()只会读取数值，剩下"\n"还没有读取，并将cursor放在本行中。
//
//        2.nextLine()会读取"\n"，并结束（nextLine() reads till the end of line \n）。

public class Input {
    public static void main(String[] args) {
//        in0();
        in1();

    }

    public static void in0() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }

    public static void in1() {
        Scanner s = new Scanner(System.in);
        String[] inputArray = s.nextLine().split(",");
        int[] coins = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            coins[i] = Integer.parseInt(inputArray[i]);
            System.out.println(coins[i]);
        }
    }

    public static void in2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
            n--;
        }
    }

    public static void in3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("使用next()方法，将空格作为间隔符。输入为：");
        while (sc.hasNext()) {
            System.out.print("输出为：");
            String n = sc.next();
            System.out.print(n);
        }
    }
    public static void in4(){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        while(len!=0){
            int sum = 0;
            for (int i=0;i<len;i++){
                sum = sum + sc.nextInt();
            }
            len = sc.nextInt();
            System.out.println(sum);
        }
    }
    public static void in5(){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n>0){
            int sum = 0;
            String a = sc.nextLine();
            String[] as = a.split(" ");
            for(int i=1;i<as.length;i++){
                sum = sum + Integer.parseInt(as[i]);
            }
            System.out.println(sum);
            n--;
        }
    }
    public static void in6(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            int sum = 0;
            String a = sc.nextLine();
            String[] as = a.split(" ");
            for(int i=1;i<as.length;i++){
                sum = sum + Integer.parseInt(as[i]);
            }
            System.out.println(sum);
        }
    }



}