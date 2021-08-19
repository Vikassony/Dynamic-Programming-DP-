/*
 64.Minimum Path Sum (Leetcode)
 Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Example 1:
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
Example 2:

Input: grid = [[1,2,3],[4,5,6]]
Output: 12
 
*/
class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        for(int i=grid.length-1;i>=0;i--){
            for(int j=grid[0].length-1;j>=0;j--){
                if(i==grid.length-1 && j==grid[0].length-1){
                    dp[i][j]=grid[i][j];
                }
                else if(i==grid.length-1){
                    dp[i][j]=dp[i][j+1]+grid[i][j];
                }
                else if(j==grid[0].length-1){
                    dp[i][j]=dp[i+1][j]+grid[i][j];
                }
                else{
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+grid[i][j];
                }
            }
        }
        return dp[0][0];
    }
}
