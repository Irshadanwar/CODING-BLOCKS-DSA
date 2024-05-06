package lec3;
import java.util.*;
public class pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),row = 1,star = 1,space = n - 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			row++;
			space--;
			star += 2;

		}
	}

}
/* My code
int n = sc.nextInt(),space=n,star=1,row=1;
while (row<=n) {
	//space
	
	int i=1;
	while(i<space) {
		System.out.print("  ");
		i++;
	}
		
	//star
	int j =1;
	while(j<=star) {
		System.out.print("* ");
	    j++;
		
	}
	//next row 
	space--;
	star=star+2;
	row++;
	System.out.println();
}
*/