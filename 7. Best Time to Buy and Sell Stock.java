//Only One transaction allowed
class Solution {
    public int maxProfit(int[] prices) {
        int lsd=prices[0];
        int Opro=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<lsd)
            {
                lsd=prices[i];
            }
            if(prices[i]-lsd>Opro)
                Opro=prices[i]-lsd;
        }
        return Opro;
    }
}
