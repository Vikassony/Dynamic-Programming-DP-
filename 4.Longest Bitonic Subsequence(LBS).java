import java.util.Scanner;

class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int lis[] = new int[a.length];
		for (int i = 0; i < lis.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j]) {
					if (lis[j] > max)
						max = lis[j];
				}
			}
			lis[i] = max + 1;
		}
		int lds[] = new int[a.length];
		for (int i = lds.length - 1; i >= 0; i--) {
			int max = 0;
			for (int j = lds.length - 1; j > i; j--) {
				if (a[i] > a[j]) {
					if (lds[j] > max)
						max = lds[j];
				}
			}
			lds[i] = max + 1;
		}
		int Omax = 0;
		for (int i = 0; i < lis.length; i++) {
			if (lis[i] + lds[i] - 1 > Omax)
				Omax = lis[i] + lds[i] - 1;
		}
		System.out.println(Omax);
	}
}
