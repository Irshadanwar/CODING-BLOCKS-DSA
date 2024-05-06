package lec3;

import java.util.Scanner;

public class Pattern_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),row = 1,star = 1,space = n - 1;
		while (row <= n) {
			int var=1;
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print(var+"\t");
				j++;
				var++;
			}
			System.out.println();
			row++;
			space--;
			star += 2;

		}
	}

}
