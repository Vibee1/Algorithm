import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class leetCode56 {
    public static int[][] merge(int[][] intervals) {
        // 排序intervals数组
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        ArrayList<int[]> ans = new ArrayList<>();
        for (int[] interval : intervals) {
            int lenAns = ans.size();
            // 合并情况
            if (lenAns > 0 && interval[0] <= ans.get(lenAns-1)[1]){
                // 更新右区间
                ans.get(lenAns-1)[1] = Math.max(ans.get(lenAns-1)[1],interval[1]);
            // 不合并情况，直接放到集合内
            }else {
                ans.add(interval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {

    }
}
