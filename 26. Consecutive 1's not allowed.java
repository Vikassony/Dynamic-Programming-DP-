/*
Given a positive integer N, count all possible distinct binary strings of length N such that there are no consecutive 1’s. Output your answer modulo 10^9 + 7.

Example 1:

Input:
N = 3
Output: 5
Explanation: 5 strings are (000,
001, 010, 100, 101).
*/
class Solution {
    long countStrings(int n) {
        
        int c1=1,c0=1;
        for(int i=2;i<=n;i++){
            int n1=c0;
            int n0=c0+c1;
            c1=n1;
            c0=n0;
        }
        return (c1+c0)%1000000007;
    }
}
