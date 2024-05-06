package Lec22;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		System.out.println(fib(n));
		
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if (n == 0 || n==1) {
			return n;
		}
		
		int f1=fib(n-1);//sp
		int f2=fib(n-2);//sp
		return f1+f2;
	}
}
