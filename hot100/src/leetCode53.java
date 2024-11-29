public class leetCode53 {
    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        int min_pre = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans = Math.max(ans,sum-min_pre);
            min_pre = Math.min(sum,min_pre);
        }
        return ans;
    }



    public static void main(String[] args) {

    }
}
