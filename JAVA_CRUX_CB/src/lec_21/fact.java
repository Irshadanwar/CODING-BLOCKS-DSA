package lec_21;

public class fact {

	public static void main(String[] args) {
		int n=13;
		System.out.println(fac(n));
			
	}
	public static int fac(int n) {
		if (n==0) {
			return 1;
		}
		int fn = fac(n-1);//smaller problem
		return n * fn;
		//n=12 ke baad glt answer a raha hai
	}
}
