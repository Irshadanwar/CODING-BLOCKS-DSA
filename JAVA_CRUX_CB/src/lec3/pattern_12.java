package lec3;
import java.util.*;
public class pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		//change star from n to 1
		int star = 1 ;
		//change space from 0 to n
		int space = n-1;
		while (row<=n) {
			int i=1;
			while (i <= space) {
				System.out.print("  ");
				i++;	
			}
			//star
			int j =1;
			while (j <= star) {
				if (j%2==0) {
				System.out.print("* ");
				} else {
					System.out.print("! ");
				}
				j++;
			}
			//next row
			System.out.println();
		    row++;
		    //space
		    space--;
		    star=star+2;
		    }

	}

}
