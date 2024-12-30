import java.util.HashSet;
import java.util.Set;

public class leetCode128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int res = 0;
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }

        for (int num : nums) {
            // 剪枝操作
            if(hs.contains(num - 1)){
                continue;
            }
            int temp_res = 1;
            int i = 1;
            while (hs.contains(num + i)) {
                temp_res++;
                i++;
            }
            res = Math.max(res, temp_res);
        }

        return res;
    }
}
