/*
Given an integer N and a 2D array cost[][3], where cost[i][0], cost[i][1], and cost[i][2] is the cost of painting ith house with colors red, blue, and green respectively, the task is to find the minimum cost to paint all the houses such that no two adjacent houses have the same color.

Examples:

Input: N = 3, cost[][3] = {{14, 2, 11}, {11, 14, 5}, {14, 3, 10}}
Output: 10
Explanation: 
Paint house 0 as blue. Cost = 2. Paint house 1 as green. Cost = 5. Paint house 2 as blue. Cost = 3.
Therefore, the total cost = 2 + 5 + 3 = 10.

Input: N = 2, cost[][3] = {{1, 2, 3}, {1, 4, 6}}
Output: 3
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[][] = new int[n][3];
            
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            
            long dp[][] = new long[n][3];
            dp[0][0]=a[0][0];
            dp[0][1]=a[0][1];
            dp[0][2]=a[0][2];
            
            for(int i=1;i<n;i++){
                dp[i][0]=a[i][0]+Math.min(dp[i-1][1],dp[i-1][2]);
                dp[i][1]=a[i][1]+Math.min(dp[i-1][0],dp[i-1][2]);
                dp[i][2]=a[i][2]+Math.min(dp[i-1][0],dp[i-1][1]);
            }
                long x = Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2]));
                System.out.println(x);
    }
}
