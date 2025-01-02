import java.util.*;

public class leetCode22 {
    String[] k = {"(", ")"};
    StringBuilder path = new StringBuilder();
    List<String> result = new ArrayList<>();
    public void backTracking(int n) {
        if(path.length() / 2 == n){
            if (isWork(path)){
                result.add(path.toString());
            }
            return;
        }
        for (int i = 0; i < k.length; i++) {
            path.append(k[i]);
            int m = path.length();
            backTracking(n);
            path.deleteCharAt(m - 1);
        }
    }

    private boolean isWork(StringBuilder path) {
        Deque<String> dq = new LinkedList<>();
        for (int i = 0; i < path.length(); i++) {
            String c = String.valueOf(path.charAt(i));
            if (c.equals(k[0])){
                dq.push(k[1]);
            }else if (dq.isEmpty()){
                return false;
            }else {
                dq.pop();
            }
        }
        return dq.isEmpty();
    }

    public List<String> generateParenthesis(int n) {
        backTracking(n);
        return result;
    }

}

