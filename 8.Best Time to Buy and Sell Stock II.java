//Multiple transaction is allowed

import java.util.Scanner;

class Test {
	public static void mdpin(String[] dprgs) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp[] = new int[n];
		for (int i = 0; i < n; i++)
			dp[i] = sc.nextInt();
		int sd = 0;
		int bd = 0;
		int profit = 0;
		for (int i = 1; i < n; i++) {
			if (dp[i] >= dp[i - 1])
				sd++;
			else {
				profit += dp[sd] - dp[bd];
				sd = bd = i;
			}
		}
		profit += dp[sd] - dp[bd];
		System.out.println(profit);
	}
}
