/*
Given a fence with n posts and k colors, find out the number of ways of painting the fence such that at most 2 adjacent posts have the same color. Since answer can be large return it modulo 10^9 + 7.


Example 1:

Input:
N=3,  K=2 
Output: 6
*/

class Solution
{
    long countWays(int n,int k)
    {
        long s=0;
        long d=k;
        long total=s+d;
        
        for(int i=2;i<=n;i++){
            s=d;
            d=total*(k-1);
            total=s+d;
            total%=1000000007;
        }
        return total;
    }
}
