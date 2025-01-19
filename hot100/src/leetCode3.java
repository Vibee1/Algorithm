import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetCode3 {
    /**
     * 思路：用集合存放字符
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        int left = 0;
        char[] sCharArray = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < sCharArray.length; right++) {
            while (map.containsKey(sCharArray[right])) {
                map.remove(sCharArray[left]);
                left++;
            }
            map.put(sCharArray[right], right);
            result = Math.max(result, right - left + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
