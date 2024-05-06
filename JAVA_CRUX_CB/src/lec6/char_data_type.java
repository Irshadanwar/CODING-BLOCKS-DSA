package lec6;

import java.util.Scanner;

public class char_data_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char ch = 'a';
		int i = 1;
		// how to take input
		char ch1 = sc.next().charAt(0);
		ch++; //ch = (char) (ch+1);
		System.out.println(ch);
		//ch = ch+1; will show error
		ch = (char) (ch+1);
		System.out.println(ch);
	}

}
