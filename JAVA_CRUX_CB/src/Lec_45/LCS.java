package Lec_45;

import java.util.*;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "abc";
		String text2 = "abced";
		System.out.println(lcs(text1, text2, 0, 0));
		int [][]dp = new int [text1.length()][text2.length()];
		for (int []a:dp) {
			Arrays.fill(a, -1);
		}
	}

	public static int lcs(String s1, String s2, int i, int j) {

		int ans = 0;
		if (s1.charAt(i) == s2.charAt(i)) {
			ans = 1 + lcs(s1, s2, i + 1, j + 1);
		} else {
			int f = lcs(s1, s2, i + 1, j);
			int s = lcs(s1, s2, i, j + 1);
			ans = Math.max(f, s);
		}
		return ans;
	}

	public static int lcsTD(String s1, String s2, int i, int j) {
		if (i==s1.length()|| j==s2.length()) {
			return 0;
		}
		if 

		int ans = 0;
		if (s1.charAt(i) == s2.charAt(i)) {
			ans = 1 + lcs(s1, s2, i + 1, j + 1);
		} else {
			int f = lcs(s1, s2, i + 1, j);
			int s = lcs(s1, s2, i, j + 1);
			ans = Math.max(f, s);
		}
	}
}
