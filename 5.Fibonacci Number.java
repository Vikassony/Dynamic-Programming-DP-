class Solution {
	public int fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int dp[] = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
/*
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Fib(n));
		int qb[] = new int[n+1];
		System.out.println(FibMemo(n,qb));
		System.out.println(FibDP(n));
	}
	public static int FibDP(int n){ // Dp Code
	    if(n==0 || n==1 )
            return n;	    
        
        int dp[] = new int[n+1];
        
        dp[0]=0;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
	}
	public static int Fib(int n){ //Recursive code
	    if(n==0 || n==1)
	    return n;
	    
	    return Fib(n-1)+Fib(n-2);
	}
	public static int FibMemo(int n,int qb[]){ // Dp with Memoization code
	    if(n==0 || n==1)
	    return n;
	    
	    if(qb[n]!=0)
	    return qb[n];
	    
	    int f1=FibMemo(n-1,qb);
	    int f2=FibMemo(n-2,qb);
	    
	    qb[n]=f1+f2;
	    return f1+f2;
	}
}


*/
