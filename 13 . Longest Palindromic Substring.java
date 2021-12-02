class Solution{
    static String longestPalin(String S){
        int f=0;
        int s=0;
        int min=0;
        boolean flag=true;
        boolean dp[][] = new boolean[S.length()][S.length()];
        for(int g=0;g<dp.length;g++)
        {
            boolean flag1=true;
            for(int i=0,j=g;j<dp.length;i++,j++){
                if(g==0){
                    dp[i][j]=true;
                }
                else if(g==1){
                    dp[i][j]=S.charAt(i)==S.charAt(j);
                    if(dp[i][j] && flag){
                       f=i;
                        s=j;
                        flag=false;
                    }
                }
                else{
                    if(S.charAt(i)==S.charAt(j) && dp[i+1][j-1]){
                        dp[i][j]=true;
                        if(flag1){
                        f=i;
                        s=j;
                        flag1=false;
                        }
                    }
                }
            }
        }
        return S.substring(f,s+1);
    }
}
