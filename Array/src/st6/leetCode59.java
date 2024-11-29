package st6;

public class leetCode59 {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int startX = 0;
        int startY = 0;
        int offet = 1;
        int loop = 1;
        int count = 1;
        int i, j;
        while (loop <= n / 2) {
            for (j = startY; j < n - offet; j++) {
                nums[startX][j] = count++;
            }

            for (i = startX; i < n - offet; i++) {
                nums[i][j] = count++;
            }

            for (; j > startY; j--) {
                nums[i][j] = count++;
            }

            for (; i > startX; i--) {
                nums[i][j] = count++;
            }

            startX++;
            startY++;
            offet++;
            loop++;
        }
        if (n % 2 == 1) {
            nums[startX][startY] = count;
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}
