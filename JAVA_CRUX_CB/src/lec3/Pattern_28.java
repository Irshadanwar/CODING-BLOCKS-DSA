package lec3;

import java.util.Scanner;

public class Pattern_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),row = 1,star = 1,space = n - 1; 
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1,val=row;
			while (j <= star) {
				System.out.print(val+"\t");
				if (j<(star+1)/2) {
					val++;
				}
				else {
					val--;
				}
				j++;
			}
			System.out.println();
			row++;
			space--;
			star += 2;

		}
	}

}
