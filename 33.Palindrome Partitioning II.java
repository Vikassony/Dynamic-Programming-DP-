class Solution {
    public int minCut(String s) {
        boolean dp[][] = new boolean[s.length()][s.length()];
	    for(int g=0;g<dp.length;g++){
	        for(int i=0,j=g;j<dp.length;i++,j++){
	            if(g==0){
	                dp[i][j]=true;
	            }else if(g==1){
	                dp[i][j]=s.charAt(i)==s.charAt(j);
	            }
	            else{
	                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
	                    dp[i][j]=true;
	                }
	            }
	        }
	    }
	    int dp1[] = new int[s.length()];
        dp1[0]=0;
        for(int j=1;j<dp1.length;j++){
            if(dp[0][j]){
                dp1[j]=0;
            }else{
            int min=Integer.MAX_VALUE;
            for(int i=j;i>=1;i--){
                if(dp[i][j]){
                    if(dp1[i-1]<min)
                    min=dp1[i-1];
                }
            }
            dp1[j]=min+1;
        }
        }
        return dp1[dp1.length-1];
    }
}
