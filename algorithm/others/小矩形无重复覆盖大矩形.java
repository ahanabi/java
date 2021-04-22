package others;

/**
 * @author Ahanabi
 * @create 2020-07-29 21:40
 */
public class 小矩形无重复覆盖大矩形 {
}
class Solution2{
    public static long fibonacii(int n){
        if(n < 4)
            return n;
        long result = 0;
        long preone = 3;
        long pretwo = 2;
        for (int i = 4; i <= n; i++) {
            result = preone + pretwo;
            preone = result;
            pretwo = preone;
        }
        return result;
    }
}
