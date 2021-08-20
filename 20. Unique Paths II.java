/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and space is marked as 1 and 0 respectively in the grid.

 Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
Output: 2
Explanation: There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right
*/
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       if (obstacleGrid[0][0] == 1)
			return 0;
		else if (obstacleGrid.length > 1 && obstacleGrid[0].length > 1) {
			if (obstacleGrid[0][1] == 1 && obstacleGrid[1][0] == 1)
				return 0;
		}
		int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
		int c = 1, c1 = 1;
		for (int i = 0; i < obstacleGrid.length; i++) {
			for (int j = 0; j < obstacleGrid[0].length; j++) {
				if (i == 0) {
					if (obstacleGrid[i][j] == 1) {
						c = -1;
						dp[i][j] = -1;
					} else
						dp[i][j] = c;
				} else if (j == 0) {
					if (obstacleGrid[i][j] == 1) {
						c1 = -1;
						dp[i][j] = c1;
					} else
						dp[i][j] = c1;
				} else if (i == 1 || j == 1) {
					if (obstacleGrid[i][j] != 1 && dp[i][j - 1] != -1 && dp[i - 1][j] != -1) {
						dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
					} else if (obstacleGrid[i][j] != 1 && dp[i][j - 1] == -1 && dp[i - 1][j] != -1) {
						dp[i][j] = dp[i - 1][j];
					} else if (obstacleGrid[i][j] != 1 && dp[i][j - 1] != -1 && dp[i - 1][j] == -1) {
						dp[i][j] = dp[i][j - 1];
					}
				} else {
					if (obstacleGrid[i][j] != 1) {
						dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
					} else if (obstacleGrid[i][j] != 1 && dp[i][j - 1] == 1 && dp[i - 1][j] != 1) {
						dp[i][j] = dp[i - 1][j];
					} else if (obstacleGrid[i][j] != 1 && dp[i][j - 1] != 1 && dp[i - 1][j] == 1) {
						dp[i][j] = dp[i][j - 1];
					}
				}
			}
		}

		return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1] != -1
				? dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1]
				: 0;
	}
}
