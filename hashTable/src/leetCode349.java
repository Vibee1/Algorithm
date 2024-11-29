import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class leetCode349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            nums.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(nums.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }
        return result.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {

    }
}
