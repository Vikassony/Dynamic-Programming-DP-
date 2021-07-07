import java.util.*;

public class Test {
	public static class Bridges implements Comparable<Bridges> {
		int n, s;

		Bridges(int n, int s) {
			this.n = n;
			this.s = s;
		}

		public int compareTo(Bridges o) {
			if (this.n != o.n)
				return this.n - o.n;
			else
				return this.s - o.s;
		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Bridges b[] = new Bridges[n];
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String s[] = str.split(" ");
			int nr = Integer.parseInt(s[0]);
			int so = Integer.parseInt(s[1]);
			b[i] = new Bridges(nr, so);
		}
		Arrays.sort(b);
		int omax = 0;
		int dp[] = new int[n];
		for (int i = 0; i < dp.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (b[j].s <= b[i].s) {
					if (dp[j] > max)
						max = dp[j];
				}
			}
			dp[i] = max + 1;
			if (dp[i] > omax)
				omax = dp[i];
		}
		System.out.println(omax);
	}

}
