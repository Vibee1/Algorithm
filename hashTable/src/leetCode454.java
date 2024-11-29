import java.util.HashMap;

public class leetCode454 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        HashMap<Integer, Integer> ab = new HashMap<>();
        for (int a : nums1) {
            for (int b : nums2) {
                int sum = a + b;
                ab.put(sum, ab.getOrDefault(sum, 0) + 1);
            }
        }

        for (int c : nums3) {
            for (int d : nums4) {
                res += ab.getOrDefault(-c - d, 0);
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
