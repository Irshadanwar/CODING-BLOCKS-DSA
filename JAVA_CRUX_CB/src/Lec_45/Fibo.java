package Lec_45;
import java.util.*;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fib(n));
		int[] dp = new int[n + 1];
		System.out.println(fibTD(n, dp));

	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if (n == 0 || n == 1) {
			return n;
		}

		int f1 = fib(n - 1);
		int f2 = fib(n - 2);
		return f1 + f2;
	}

	private static int fibTD(int n ,int[] dp) {
		// TODO Auto-generated method stub
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n]!=0) {//dp apply karna
			return dp[n];
		}
		int f1 = fibTD(n - 1, dp);
		int f2 = fibTD(n - 2, dp);
		return f1 + f2;//yaad kra hun
	}

}
