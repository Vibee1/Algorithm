import java.io.UnsupportedEncodingException;

public class leetCode541 {
    /*    给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，
          就反转这 2k 字符中的前 k 个字符。

        如果剩余字符少于 k 个，则将剩余字符全部反转。
        如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。*/
    public static String reverseStr(String s, int k) throws UnsupportedEncodingException {
        char[] sCharArray = s.toCharArray();
        k = Math.min(k, s.length() - 1);
        int flag = 2 * k;
        //反转这 2k 字符中的前 k 个字符。
        reverseS(sCharArray, 0, k - 1);
        int otherChar = s.length() - flag;
        if (otherChar < k) {
            reverseS(sCharArray, 2 * k, s.length() - 1);
        } else if (otherChar < 2 * k) {
            reverseS(sCharArray, 2 * k, 3 * k - 1);
        }
        return new String(sCharArray);
    }

    public static void reverseS(char[] sCharArray, int left, int right) {
        int left1 = left;
        int right1 = right;
        while (left1 < right1) {
            char temp = sCharArray[right1];
            sCharArray[right1] = sCharArray[left1];
            sCharArray[left1] = temp;
            left1++;
            right1--;
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = reverseStr("\"krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc", 20);
    }
}
