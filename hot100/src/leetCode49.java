import java.util.*;

public class leetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hs = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            hs.computeIfAbsent(new String(chars), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(hs.values());
    }

    public static void main(String[] args) {

    }
}
