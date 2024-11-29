import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class leetCode242 {
    public static boolean isAnagram(String s, String t) {
        int[] dict = new int[28];
        for (int i = 0; i < s.length(); i++) {
            dict[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            dict[t.charAt(i) - 'a']--;
        }
        return Arrays.stream(dict).allMatch(element -> element == 0);
    }

    public static void main(String[] args) {

    }
}
