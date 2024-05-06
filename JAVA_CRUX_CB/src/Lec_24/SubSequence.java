package Lec_24;

import java.util.Iterator;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		PrintPattern(str);
	}
	public static void PrintPattern(String str) {
		
		int len = str.length();
		for (int i =0;i<(1<<len);i++) {
			Pattern(i,str);
		}
	}
	public static void Pattern(int i, String str) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i!=0) {
			if ((i&1)!=0) {
				System.out.print(str.charAt(pos));
			}
			pos++;
			i>>=1;
		}
		System.out.println();
	}
}
