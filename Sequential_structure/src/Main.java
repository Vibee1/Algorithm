public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    public boolean backspaceCompare(String s, String t) {
        int slow = 0;
        for (int fast = 0; fast < s.length(); fast++) {
            if (s.charAt(fast) != '#'){
                s.charAt(slow++) = s.charAt(fast);
            }else {
                slow--;
            }
        }
    }
}