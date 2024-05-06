package Lec_24;

public class SubSequnce_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsequnce("abc","");
		System.out.println(count);
	}

	static int count = 0;//global variable(will get created in heap memory)
	private static void Subsequnce(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			count++;
			return;
		}
		char ch =ques.charAt(0);
		Subsequnce(ques.substring(1), ans);
		Subsequnce(ques.substring(1), ans + ch);	
	}
}
