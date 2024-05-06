package lec4;
import java.util.*;
public class pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1 ;
		int row =1;
		int space = n-1;
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
			if (row<n) {
				space--;
				star++;
			}else {
				star--;
				space++;
			}
			
			//next row
			System.out.println();
		    row++;
		//space
			
		}
	}

}
