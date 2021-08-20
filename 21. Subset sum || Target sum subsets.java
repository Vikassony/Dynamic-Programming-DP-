/*
Given an array of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum. 
Example 1:

Input:
N = 6
arr[] = {3, 34, 4, 12, 5, 2}
sum = 9
Output: 1 
Explanation: Here there exists a subset with
sum = 9, 4+3+2 = 9.
*/
class Solution {

	static Boolean isSubsetSum(int N, int arr[], int sum) {
		boolean dp[][] = new boolean[N + 1][sum + 1];

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = true;
				} else if (i == 0) {
					dp[i][j] = false;
				} else if (j == 0) {
					dp[i][j] = true;
				} else {
					if (dp[i - 1][j] == true) {
						dp[i][j] = true;
					} else {
						int val = arr[i - 1];
						if (j >= val && dp[i - 1][j - val] == true)
							dp[i][j] = true;
						else if (j == val)
							dp[i][j] = true;
					}
				}
			}
		}
		return dp[N][sum];
	}
}
