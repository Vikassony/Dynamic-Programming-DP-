/*
62. leetcode
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

 Input: m = 3, n = 7
Output: 28
Example 2:

Input: m = 3, n = 2
Output: 3
*/

class Solution {
    public int uniquePaths(int m, int n) {
        if(n==1 || m==1)
            return 1;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    dp[i][j]=1;
                }
                else if(j==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
