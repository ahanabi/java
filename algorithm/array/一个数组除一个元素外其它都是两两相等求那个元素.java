package array;

/**
 * @author Ahanabi
 * @create 2020-08-03 22:53
 */
public class 一个数组除一个元素外其它都是两两相等求那个元素 {
    public static int find1From2(int[] a) {
        int len = a.length, res = 0;
        for (int i = 0; i < len; i++) {
            res = res ^ a[i];
        }
        return res;
    }

}
