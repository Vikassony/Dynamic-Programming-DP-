/*
1. You are given a number n and a number k separated by a space, representing the number of houses and number of colors.
2. In the next n rows, you are given k space separated numbers representing the cost of painting nth house with one of the k colors.
3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.

Sample Input
4 3
1 5 7
5 8 4
3 2 9
1 2 4

ans : 8
*/

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int a[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int dp[][] = new int[n][m];
		int least = Integer.MAX_VALUE;
		int sleast = Integer.MAX_VALUE;
		for (int j = 0; j < a[0].length; j++) {
			dp[0][j] = a[0][j];

			if (a[0][j] <= least) {
				sleast = least;
				least = a[0][j];
			} else if (a[0][j] < sleast) {
				sleast = a[0][j];
			}
		}

		for (int i = 1; i < dp.length; i++) {
			int nleast = Integer.MAX_VALUE;
			int nsleast = Integer.MAX_VALUE;
			for (int j = 0; j < dp[0].length; j++) {
				if (least == dp[i - 1][j]) {
					dp[i][j] = sleast + a[i][j];
				} else {
					dp[i][j] = least + a[i][j];
				}

				if (dp[i][j] <= nleast) {
					nsleast = nleast;
					nleast = dp[i][j];
				} else if (dp[i][j] < nsleast) {
					nsleast = dp[i][j];
				}
			}
			least = nleast;
			sleast = nsleast;

		}
		System.out.println(least);
	}
}
