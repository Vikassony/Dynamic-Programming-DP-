//obd-->old buy day, osd-->old selling day, nbd-->new buy day, nsd-->new selling day
class Solution {
	public int maxProfit(int[] prices, int fee) {
		int obd = -prices[0], osd = 0, nbd = 0, nsd = 0;
		for (int i = 1; i < prices.length; i++) {
			if (osd - prices[i] > obd) {
				nbd = osd - prices[i];
			} else {
				nbd = obd;
			}
			if (prices[i] + obd - fee > osd) {
				nsd = prices[i] + obd - fee;
			} else {
				nsd = osd;
			}
			osd = nsd;
			obd = nbd;
		}
		return osd;
	}
}
