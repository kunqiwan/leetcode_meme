package twoSum;

public class odootest2 {

    public static int ArrayChallenge(String[] strArr) {
        int col_length = strArr.length;
        int row_length = strArr[0].length();
        int[][] matrix = new int[col_length][row_length];
        int row = 0, col = 0;
        for (int i = 0; i < col_length; i++) {
            for (int j = 0; j < row_length; j++) {
                matrix[i][j] = strArr[i].charAt(j) - '0';
                if (matrix[i][j] == 1) {
                    row = i;
                    col = j;
                }
            }
        }
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < col_length; i++) {
            for (int j = 0; j < row_length; j++) {
                if (matrix[i][j] == 2) {
                    int dist = Math.min(Math.abs(row - i), col_length - Math.abs(row - i))
                            + Math.min(Math.abs(col - j), row_length - Math.abs(col - j));
                    minDistance = Math.min(minDistance, dist);
                }
            }
        }
        return minDistance == Integer.MAX_VALUE ? 0 : minDistance;
    }

    public static void main (String[] args) {
        // keep this function call here
        String [] s = new String[] {"0000", "1000", "0002", "0002"};
        System.out.println(ArrayChallenge(s));

    }

}
