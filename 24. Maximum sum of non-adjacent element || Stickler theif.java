/*
Given an array of positive numbers, find the maximum sum of a subsequence with the constraint that no 2 numbers in the sequence should be adjacent in the array. So 3 2 7 10 should return 13 (sum of 3 and 10) or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).Answer the question in most efficient way.

Examples : 

Input : arr[] = {5, 5, 10, 100, 10, 5}
Output : 110

Input : arr[] = {1, 2, 3}
Output : 4

Input : arr[] = {1, 20, 3}
Output : 20
*/

class Solution
{
    public int FindMaxSum(int arr[], int n)
    {
        if(n==1){
            return arr[0];
        }
        int inc=arr[0];
        int exc=0;
        for(int i=1;i<n;i++){
            int ninc=exc+arr[i];
            int nexc=Math.max(inc,exc);
            
            inc=ninc;
            exc=nexc;
        }
        return Math.max(inc,exc);
    }
}
