package lec_21;

import java.util.Scanner;

public class Print_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		print(5);
	}

	private static void print(int i) {
		if (i==0) {
			return;
		}
		System.out.println(i);
		print(i-1);
	}

}
