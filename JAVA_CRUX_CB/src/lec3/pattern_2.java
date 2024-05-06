package lec3;

import java.util.*;

public class pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1 ;
		int row =1;
		while (row<=n ) {
			
			int i = 1;
			while(i<= star) {
				System.out.print("* ");
				i++;
			}
			//next row
			star++;
			System.out.println();
			row++;

		}
	}

}
/*package lec3;
import java.util.*;
public class pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1 ;
		int row =1;
		while (row<=n ) {
			
			int i = 1;
			while(i<= row) {
				System.out.print("* ");
				i++;
			}
			//next row
			System.out.println();
			row++;

		}

	}

}*/
