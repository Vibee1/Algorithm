import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetCode216 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public void backtracking(int n, int k, int startIndex){
        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i <= 9; i++) {
            path.add(i);
            backtracking(n,k,i+1);
            path.removeLast();
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(n,k,1);
        return result;
    }
    public static void main(String[] args) {

    }
}
