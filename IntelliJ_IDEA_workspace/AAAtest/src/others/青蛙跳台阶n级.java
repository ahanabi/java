package others;

/**
 * @author Ahanabi
 * @create 2020-07-29 21:44
 */
public class 青蛙跳台阶n级 {
    public static void main(String[] args) {
        System.out.println(Solution3.fibonacii(4));
    }
}
class Solution3{
    public static long fibonacii(int n){
//        return 2 << (n - 2);
        return (long)Math.pow(2,n - 1);
    }
}
