import java.util.Scanner;

class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int max_so_far = a[0];
		int max_till_here = a[0];
		for (int i = 1; i < n; i++) {
			if (max_till_here >= 0) {
				max_till_here += a[i];
			} else
				max_till_here = a[i];
			if (max_till_here > max_so_far)
				max_so_far = max_till_here;
		}
		System.out.println(max_so_far);
	}
}
