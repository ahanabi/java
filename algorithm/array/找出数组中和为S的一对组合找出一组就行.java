package array;

import java.util.HashMap;

/**
 * @author Ahanabi
 * @create 2020-08-03 22:54
 */
public class 找出数组中和为S的一对组合找出一组就行 {
    public int[]
    twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map =
                new HashMap<Integer, Integer>();
        int[] a = new int[2];
        map.put(nums[0], 0);
        for (int i = 1; i < nums.length;
             i++) {
            if (map.containsKey(target - nums[i])) {
                a[0] = map.get(target -
                        nums[i]);
                a[1] = i;
                return a;
            } else {
                map.put(nums[i], i);
            }
        }
        return a;
    }

}

