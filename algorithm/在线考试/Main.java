package AAA在线考试;


class Main {

    public static void main (String[] args){
        String classFile = "hello.world.". replaceAll(".","/") +"TestClass.class";System.out.println(classFile);
    }}

//
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = in.nextInt();
//        }
//        int max = 0;
//        int c = n - m + 1;
//        while (c > 1) {
//            int[] temp = new int[m];
//            for (int i = 0; i < n - m + 1; i++) {
//                int j = i;
//                int a = 0;
//                int sum = 0;
//                while (a < m) {
//                    sum += nums[j];
//                    a++;
//                    j++;
//                }
//                if (sum > max) {
//                    max = sum;
//                }
//
//            }
//
//            c--;
//
//        }
//        System.out.println(FindGreatestsumOfSubArray(nums));
//    }
//
//
//
//
//    public static int FindGreatestsumOfSubArray(int[] array) {
//        int len = array.length;
//        int[] dp = new int[len];
//        int max = array[0];
//        dp[0] = array[0];
//        for (int i = 1; i < len; i++) {
//            int newMax = dp[i - 1] + array[i];
//            if (newMax > array[i])
//                dp[i] = newMax;
//            else
//                dp[i] = array[i];
//            if (dp[i] > max)
//                max = dp[i];
//        }
//        return max;
//    }
//
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String olds = in.nextLine();
//        String[] newStr = olds.split(" ");
//        int[] nums = new int[newStr.length];
//        for (int i = 0; i < newStr.length; i++) {
//            nums[i] = Integer.parseInt(newStr[i]);
//        }
//        int total = nums[nums.length - 1];
//        for (int i = nums.length - 2; i > -1; i--) {
//
//            if (nums[i] > total) {
//                total = 2 * nums[i];
//            }
//            if (nums[i] < nums[i + 1]) {
//                total += 2 * nums[i];
//            }
//            if (nums[i] > nums[i + 1] && 2 * nums[i] < total) {
//                total += nums[i];
//            }
//
//
//        }
//        System.out.println(total);
//
//    }
//}