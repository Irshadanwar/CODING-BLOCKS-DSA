package lec3;

import java.util.Scanner;

public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt(),row = 1,star = 1;
		while (row <=2*n-1) {
			  int i =1;
			  while (i<=star) {
				  System.out.print("* ");
				  i++;
			  }
			  row++;
			  if (row<n) {
				  star++;
			  }
			  else {
				  star--;
			  }
			  System.out.println();
		}
	}

}
