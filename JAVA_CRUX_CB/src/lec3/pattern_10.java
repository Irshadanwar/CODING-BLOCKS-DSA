package lec3;
import java.util.Scanner;
public class pattern_10 {

	public static void main(String[] args) {
    // TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		//change star from 1 to n 
		int star = 2*n-1 ;
		//change space from n to 0
		int space = 0;
		while (row<=n) {
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
			//next row
			System.out.println();
		row++;
		space++;
		//star
		star=star-2;
			
		}

	}

}
