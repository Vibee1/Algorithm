import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                return result;
            }
        }
    }
    public static void main(String[] args) {

    }
}
