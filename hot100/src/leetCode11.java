public class leetCode11 {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right){
            int area = (right - left) * Math.min(height[left], height[right]);
            ans = Math.max(ans, area);
            if (height[left] < height[right]) {
                // height[left] 与右边的任意线段都无法组成一个比 ans 更大的面积
                left++;
            } else {
                // height[right] 与左边的任意线段都无法组成一个比 ans 更大的面积
                right--;
            }
        }
        return ans;
    }
}
