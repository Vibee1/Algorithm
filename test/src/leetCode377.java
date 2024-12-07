public class leetCode377 {
    static int result;
    public static void backTracking(int[] nums, int target, int sum) {
        if (sum == target) {
            result++;
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (sum > target){
                break;
            }
            sum += nums[i];
            backTracking(nums, target, sum);
            sum -= nums[i];
        }
    }

    public static int combinationSum4(int[] nums, int target) {
        backTracking(nums,target,0);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(combinationSum4(nums,4));
    }
}
