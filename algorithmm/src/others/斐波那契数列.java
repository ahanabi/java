package others;

/**
 * @author Ahanabi
 * @create 2020-07-29 20:48
 */
public class 斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(Solution.fibonacci(39));
        System.out.println(Solution.fibonacii(39));
    }
}
class Solution{
    public static int fibonacci(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else if (n > 1)
            return fibonacci(n - 1) + fibonacci(n - 2);
        else
            return -1;
    }
    public static long fibonacii(int n){
        long result = 0l;
        long preone = 1L;
        long pretwo = 0l;
        if(n == 0)
            return 0l;
        else if(n == 1)
            return 1l;

        for(int i = 2; i <= n; i++){
            result = preone +pretwo;
            pretwo = preone;
            preone = result;
        }
        return result;
    }
}