package Lec22;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		PrintSub(ques,"");
	}

	private static void PrintSub(String ques,String ans) {
		// TODO Auto-generated method stub
		if(ques.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		char ch = ques.charAt(0);
		PrintSub(ques.substring(1),ans);
		PrintSub(ques.substring(1),ans+ch);
	}
	
}
