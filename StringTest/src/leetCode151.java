import java.util.ArrayList;

public class leetCode151 {
    public static String reverseWords(String s) {
        ArrayList<String> news = new ArrayList<>();
        String[] sDiv = s.split(" ");
        for (String str : sDiv) {
            if (!str.isEmpty()) {
                news.add(str);
            }
        }

        int left = 0;
        int right = news.size() - 1;
        while (left < right) {
            String temp = news.get(right);
            news.set(right, news.get(left));
            news.set(left, temp);
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < news.size(); i++) {
            if(i == news.size() - 1){
                sb.append(news.get(i));
            }else {
                sb.append(news.get(i)).append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = reverseWords("a good   example");
        System.out.println(s);
    }
}
