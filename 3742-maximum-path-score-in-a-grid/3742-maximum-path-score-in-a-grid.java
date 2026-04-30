class Solution {

    int m, n;

    public int maxPathScore(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;

        int[][][] dp = new int[m][n][k + 1];
        for (int[][] matrix : dp) {
            for (int[] row : matrix) {
                Arrays.fill(row, -2);
            }
        }
        int maxsum = helper(grid, dp, 0, 0, 0, k);

        return maxsum;
    }

    public int helper(int[][] grid, int[][][] dp, int i, int j, int co, int k) {
        if (i >= m || j >= n)
            return -1;

        int cost = grid[i][j] == 0 ? 0 : 1;
        int score = grid[i][j];
        int ncost = cost + co;
        if (ncost > k)
            return -1;
        if (i == m - 1 && j == n - 1)
            return score;
        if (dp[i][j][ncost] != -2)
            return dp[i][j][ncost];

        int right = helper(grid, dp, i, j + 1, ncost, k);
        int down = helper(grid, dp, i + 1, j, ncost, k);
        int best = Math.max(right, down);

        return dp[i][j][ncost] = (best == -1) ? -1 : score + best;

    }
}