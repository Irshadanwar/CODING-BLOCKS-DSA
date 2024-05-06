package Lec2;

import java.util.Scanner;

public class count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int digit = sc.nextInt();
		int c =  0 ;
		while (n>0) {
			int x = (n%10);
			if (x==digit) {
				c++;

			}
			n=n/10;
		}
		System.out.println(c);

	}

}
