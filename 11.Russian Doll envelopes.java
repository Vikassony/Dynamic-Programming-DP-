// Sort according to the width and apply LIS on the heights.
class Solution {
	public int maxEnvelopes(int[][] envelopes) {
		Envelope e[] = new Envelope[envelopes.length];
		for (int i = 0; i < e.length; i++) {
			int a[] = envelopes[i];
			int w = a[0];
			int h = a[1];
			e[i] = new Envelope(w, h); // sorting on the basis of width
		}
		Arrays.sort(e);
    
		int omax = 0;
		int dp[] = new int[e.length];
		for (int i = 0; i < dp.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
			// no two width and heights should be of same length
				if (e[j].w <= e[i].w && e[j].h < e[i].h) {
					if (dp[j] > max)
						max = dp[j];
				}
			}
			dp[i] = max + 1;
			if (dp[i] > omax)
				omax = dp[i];
		}
		return omax;
	}

	public static class Envelope implements Comparable<Envelope> {
		int w, h;

		Envelope(int w, int h) {
			this.w = w;
			this.h = h;
		}

		public int compareTo(Envelope e) {
			if(this.w==e.w)
                return e.h-this.h;
            else
                return this.w-e.w;
		}

	}
}
