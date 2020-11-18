package others;

/**
 * @author Ahanabi
 * @create 2020-07-29 21:31
 */
public class 青蛙跳台阶1级或2级 {
}
class Solution1{
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

}