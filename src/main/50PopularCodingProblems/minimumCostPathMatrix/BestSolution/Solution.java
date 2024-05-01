package minimumCostPathMatrix.BestSolution;

public class Solution {
    static int minimumCostPathWithDP(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] costs = new int[n][m];
        costs[0][0] = matrix[0][0];         //matrix to store the cost of reaching ith element.
        for (int i = 1; i < m; i++)
            costs[0][i] = costs[0][i - 1] + matrix[0][i];
        for (int i = 1; i < n; i++)
            costs[i][0] = costs[i - 1][0] + matrix[i][0];
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
                costs[i][j] = Math.min(costs[i - 1][j], costs[i][j - 1]) + matrix[i][j];
        return costs[n - 1][m - 1];
    }
}
