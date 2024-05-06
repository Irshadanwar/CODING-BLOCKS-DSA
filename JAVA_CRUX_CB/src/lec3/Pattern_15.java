package lec3;
import java.util.*;
public class Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n =sc.nextInt(),row =1,star = n,space =0;
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
			//next row
			System.out.println();
		row++;
		if (row<=n) {
	    	space=space+2;
		    star--;
	    }
	    else {
	    	space=space-2;
		    star++;
	    }
		}
	}

}
