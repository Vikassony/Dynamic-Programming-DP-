/*
Input:
N = 3
W = 4
values[] = {1,2,3}
weight[] = {4,5,1}
Output: 3
*/

class Solution 
{ 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int dp[][] = new int[n+1][W+1];
         
         for(int i=1;i<dp.length;i++){
             for(int j=1;j<dp[0].length;j++){
                 if(j>=wt[i-1]){
                     int x=val[i-1]+dp[i-1][j-wt[i-1]];
                     dp[i][j]=Math.max(x,dp[i-1][j]);
                 }
                 else{
                     dp[i][j]=dp[i-1][j];
                 }
             }
         }
         return dp[n][W];
    } 
}
