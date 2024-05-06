package Doubt_class;
import java.util.*;
public class Replace_all_π {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			String s = sc.next();
			Replace_allPi(s,"");
		}
	}
	private static void Replace_allPi(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		if (ques.length() >= 2 && ques.charAt(0) == 'p' && ques.charAt(1) == 'i' ) {

			Replace_allPi(ques.substring(2),ans+ "3.14");

		} else {
			Replace_allPi(ques.substring(1), ans + ques.charAt(0));
		}
	}

}
//input 3
//xpix
//xabpixx3.15x
//xpipippixxx3.14x
//xab3.14xx3.15x
//output 
//x3.143.14p3.14xx