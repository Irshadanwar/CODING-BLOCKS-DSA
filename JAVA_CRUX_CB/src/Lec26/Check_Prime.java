package Lec26;

public class Check_Prime {

	public static void main(String[] args) {
		int n =87;
		System.out.println(isprime(n));
	}
	public static boolean isprime(int n) {
		int div = 2;
		while (div*div<=n) {
			if (n% div ==0) {
				return false;
			}
			div ++;
		}
		return true;
	}

}
