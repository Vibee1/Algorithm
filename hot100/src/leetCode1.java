import java.util.HashMap;
import java.util.Map;

public class leetCode1 {
    /**
     * 计算两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        // 利用hashMap实现时间复杂度为O（n）的算法
        int[] res = new int[2];
        Map<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hs.containsKey(target - nums[i])){
                res[0] = i;
                res[1] = hs.get(target - nums[i]);
            }else {
                hs.put(nums[i], i);
            }
        }
        return res;
    }
}
