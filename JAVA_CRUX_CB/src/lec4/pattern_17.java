package lec4;
import java.util.*;
import java.util.Scanner;

public class pattern_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = 1;
		int star = n/2;
		int row =1;
		while (row <=n) {
			int j =1 ;
			System.out.print("* ");
			j++;
		}
		int i =1 ;
		while ( i<=1 ) {
			System.out.print(" ");
			i++;	
		}
		int k = 1;
		while (k<=star) {
			System.out.print("* ");
			k++;
		}
		if ( row <=n /2) { //if (row<n/2+1)
			star--;
		}
    }

}
