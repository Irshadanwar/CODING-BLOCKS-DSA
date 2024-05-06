package lec3;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int n =sc.nextInt(),row =1,star = 1,space = n-1;
		while (row<=2*n-1) {
			int i=1;
			while (i <= space) {
				System.out.print("  ");
				i++;	
			}
			//star
			int j =1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			} 
		    row++;
		    if (row<=n) {
		    	space--;
			    star++;
		    }
		    else {
		    	space++;
			    star--;
		    }
		    System.out.println();
		}

	}

}
