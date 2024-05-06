package lec_21;

import java.util.Scanner;

public class power_tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(pow(a,b,1));
	}

	public static int pow(int a, int b,int ans) {
		if (b == 0) {
			return ans;
		}
		return pow(a, b - 1, ans*a);
	}

}
