/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you 
     could jump to in a single move.  
     You can of course jump fewer number of steps in the move.
4. You are required to print the number of different paths via which you can climb to the top.
n=6
a=[3,3,0,2,2,3]
*/
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = sc.nextInt();
    System.out.println(cp(n, a));
  }
  public static int cp(int n, int a[]) {
    int dp[] = new int[n + 1];
    dp[dp.length-1] = 1;
    for (int i = dp.length - 2; i >= 0; i--) {
      for (int j = 1; j <= a[i] && i + j < dp.length; j++) {
        dp[i] += dp[i + j];
      }
    }
    return dp[0];
  }

}
