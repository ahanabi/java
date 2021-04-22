package array;

/**
 * @author Ahanabi
 * @create 2020-08-03 22:55
 */
public class 求一个数组中连续子向量的最大和 {
    public int
    maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        if (nums == null || nums.length == 0) {
            return sum;
        }
        for (int i = 0; i < nums.length;
             i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

}
