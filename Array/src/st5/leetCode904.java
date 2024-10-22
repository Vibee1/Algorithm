package st5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class leetCode904 {
    public static void main(String[] args) {
        int[] fruits = {0, 1, 2, 2};
        int i = totalFruit(fruits);
        System.out.println(i);
    }

    public static int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();

        int left = 0, ans = 0;
        for (int right = 0; right < n; ++right) {
            cnt.put(fruits[right], cnt.getOrDefault(fruits[right], 0) + 1);
            while (cnt.size() > 2) {
                cnt.put(fruits[left], cnt.get(fruits[left]) - 1);
                if (cnt.get(fruits[left]) == 0) {
                    cnt.remove(fruits[left]);
                }
                ++left;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}


