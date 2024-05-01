package minimumCostPathMatrix.bruteForce;

public class SolutionUsingRecursion {
    public static int minimumCostPathWithRecursion(int[][] matrix, int i, int j) {
        int n = matrix.length;
        int m = matrix[0].length;
        if (i == n - 1 && j == m - 1)
            return matrix[i][j];
        else if (i == n - 1)
            return matrix[i][j] + minimumCostPathWithRecursion(matrix, i, j + 1);
        else if (j == m - 1)
            return matrix[i][j] + minimumCostPathWithRecursion(matrix, i + 1, j);
        else
            return matrix[i][j] + Math.min(minimumCostPathWithRecursion(matrix, i + 1, j), minimumCostPathWithRecursion(matrix, i, j + 1));
    }

    public static int minimumCostPathWithRecursion(int[][] matrix) {
        return minimumCostPathWithRecursion(matrix, 0, 0);
    }
}
