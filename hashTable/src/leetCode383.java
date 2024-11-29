import java.util.Arrays;

public class leetCode383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        /*用数组作为哈希表，创建一个大小为26的的数组，里面存放magazine字符串的字符出现次数
         * 再遍历ransomNote，里面的字符出现一次就减掉哈希数组
         * 遍历哈希数组，检查里面所有值是否大于0
         * */
        int[] hashTable = new int[28];

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            hashTable[c - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            hashTable[c - 'a']--;
        }

        for (int hash : hashTable) {
            if (hash < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        canConstruct("aa", "aab");
    }
}
