public class leetCode28 {
    public static int strStr(String haystack, String needle) {
        int windowLen = needle.length();
        for (int i = 0; i < haystack.length() - windowLen + 1; i++) {
            int end = i + windowLen;
            String sonString = haystack.substring(i, end);
            if (sonString.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = strStr("hello", "ll");
    }
}
