import java.util.List;

public class test {
    public static void main(String[] args) {
        leetCode22 solution = new leetCode22();
        int n = 3; // 这里可以根据你想要生成括号组合的数量来设定n的值，示例中设为3
        List<String> resultList = solution.generateParenthesis(n);
        for (String s : resultList) {
            System.out.println(s);
        }
    }
}
