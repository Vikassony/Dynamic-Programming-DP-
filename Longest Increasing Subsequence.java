class Solution {
    public int lengthOfLIS(int[] nums) {
        int Omax=0;
        int dp[] = new int[nums.length];
        for(int i=0;i<dp.length;i++)
        {
            int max=0;
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j]){
                    if(dp[j]>max)
                        max=dp[j];
                }
            }
            dp[i]=max+1;
            if(dp[i]>Omax)
                Omax=dp[i];
        }
        return Omax;
    }
}
