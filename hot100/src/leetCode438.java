import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] dict = new int[28];
        for (int i = 0; i < p.length(); i++) {
            dict[p.charAt(i) - 'a']++;
        }
        int window = p.length();
        for (int i = 0; i < s.length() - window + 1; i++) {
            int[] dict_copy = Arrays.copyOf(dict, dict.length);
            String temp = s.substring(i, i + window);
            for (int j = 0; j < temp.length(); j++) {
                dict_copy[temp.charAt(j)-'a']--;
            }
            if(allequalzero(dict_copy)){
                result.add(i);
            }
        }
        return result;
    }

    public static boolean allequalzero(int[] nums){
        for (int num : nums) {
            if(num != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
}
