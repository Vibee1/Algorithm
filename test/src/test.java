import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagWeight = 4;
        int[] dp = new int[bagWeight + 1];
//        int[][] dp = new int[weight.length + 1][bagWeight + 1];
//        for (int j = weight[0]; j <= bagWeight; j++) {
//            dp[0][j] = value[0];
//        }
        for (int i = 0; i < weight.length; i++){ // 遍历物品
            for (int j = weight[i]; j <= bagWeight; j++){ // 遍历背包容量
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
            System.out.println("dp = " + Arrays.toString(dp));
        }

    }

}
