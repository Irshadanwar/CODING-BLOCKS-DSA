package Lec20;
import java.util.*;
//codeforces 
public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//n=47474 output=41
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		System.out.println(Index(str));
		
	}
	public static int Index(String str) {
		int n = str.length();
		int count = (1 << n) - 2;//n-1 tak ke saare lucky no ka count h
		int pos =0 ;
		for (int i = str.length() - 1 ; i>=0;i--) {
			if (str.charAt(i) == '7') {
				count = count + (1<<pos);
			}
			pos++;
		}
		return count + 1;
	}
}
