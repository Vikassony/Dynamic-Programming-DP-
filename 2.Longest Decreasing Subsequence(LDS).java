import java.util.Scanner;

class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int Omax = 0;
		int dp[] = new int[a.length];
		for (int i = dp.length - 1; i >= 0; i--) {
			int max = 0;
			for (int j = dp.length - 1; j > i; j--) {
				if (a[i] > a[j]) {
					if (dp[j] > max)
						max = dp[j];
				}
			}
			dp[i] = max + 1;
			if (dp[i] > Omax) {
				Omax = dp[i];
			}
		}
		System.out.println(Omax);
	}
}
