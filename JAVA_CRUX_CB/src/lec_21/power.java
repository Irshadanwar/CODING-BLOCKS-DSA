package lec_21;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b = 6;
		System.out.println(pow(a, b));

	}

	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
//		if (b == 1) {
//			return a;
//		}
		
		int ans = pow(a, b - 1); //(a^b-1)
 
		return ans * a;
	}

}
