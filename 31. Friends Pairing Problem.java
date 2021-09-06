/*
iven n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up. 

Examples: 

Input  : n = 3
Output : 4
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int dp[] = new int[n+1];
       dp[1]=1;
       dp[2]=2;
       for(int i=3;i<=n;i++)
       dp[i]=dp[i-1]+(i-1)*dp[i-2];
       System.out.println(dp[n]);
    }

}
