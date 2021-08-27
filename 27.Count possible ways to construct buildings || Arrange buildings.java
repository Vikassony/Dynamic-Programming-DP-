/*
Given N, the number of plots on either sides of the road. Find the total ways to construct buildings in the plots such that there is a space between any 2 buildings. All plots on one side of the road are continuous.
Lets suppose ‘*’ represents a plot, then for N=3, the plots can be represented as * * * | | * * *                               

Where | | represents the road.                                                                                                                                                                  
Note: As the answer can be very large, print it mod 1000000007

 

Example 1:

Input: N = 3
Output: 25
Explanation: 3 plots, which means possible
ways for one side are BSS, BSB, SSS, SBS,
SSB where B represents a building and S
represents an empty space Total possible 
ways are 25, because a way to place on one
side can correspond to any of 5 ways on other
side.
*/
class Solution
{
    public int TotalWays(int N)
    {
        int c1=1,c0=1;
        for(int i=2;i<=N;i++){
            int n1=c0;
            int n0=c0+c1;
            c1=n1;
            c0=n0;
        }
        int t=c1+c0;
        return (t*t)%1000000007;
    }
}
