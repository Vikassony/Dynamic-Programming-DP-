import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int dp[] = new int[a.length];
		int Omax = Integer.MIN_VALUE;
		for (int i = 0; i < dp.length; i++) {
			Integer max = null;
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j]) {
					if (max == null)
						max = dp[j];
					else if (dp[j] > max)
						max = dp[j];
				}
			}
			if (max == null)
				dp[i] = a[i];
			else
				dp[i] = max + a[i];
			if (dp[i] > Omax)
				Omax = dp[i];
		}
		System.out.println(Omax);
	}

}
