import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetCode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            Map<Integer,Integer> m = new HashMap<>();
            for (int j = 0; j < nums.length; j++) {
                if(i != j){
                    if(m.containsKey(target - nums[j])){
                        int k = target - nums[j];
                        List<Integer> ls = new ArrayList<>();
                        ls.add(nums[i]);
                        ls.add(nums[j]);
                        ls.add(k);
                        result.add(ls);
                    }else {
                        m.put(nums[j], j);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println("lists = " + lists);
    }
}
