import java.util.HashMap;

public class leetCode1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];
            if (hs.containsKey(search)){
                res[0] = i;
                res[1] = hs.get(search);
                break;
            }
            hs.put(nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
