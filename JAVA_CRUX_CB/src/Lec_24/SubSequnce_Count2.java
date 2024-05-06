package Lec_24;

public class SubSequnce_Count2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n"+Subsequnce1("abc","" ));
	}
	static int count = 0;
	
	private static int Subsequnce1(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.println(ans+" ");
			return 1;
		}
		char ch =ques.charAt(0);
		int a1 = Subsequnce1(ques.substring(1), ans);
		int b1 = Subsequnce1(ques.substring(1), ans + ch);
		return a1 + b1 ;
	}

}
