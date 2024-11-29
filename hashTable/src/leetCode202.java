import java.util.HashSet;

public class leetCode202 {
    public static int getSum(int n){
        int sum = 0;
        while (n != 0){
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }

        return sum;
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while (!hs.contains(n)){
            hs.add(n);
            n = getSum(n);
            if(n == 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
