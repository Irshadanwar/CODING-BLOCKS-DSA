package Lec8;
import java.util.*;
public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n = 1634;
		int n =sc.nextInt();
		System.out.println(IsArmstrong(n));

	}
	
	public static boolean IsArmstrong(int n) {
		int c = Countofdidgit(n);
		int temp=n;
		int sum=0;
		while(n>0) {
			int  rem = n%10;
			sum= (int) (sum + Math.pow(rem, c));
			n= n/10;
		}
		
		return sum==temp;
		
		
	}

	public static int Countofdidgit(int n) {
		int c = 0;
		while (n > 0) {
			n = n / 10;
			c++;
		}
		return c;

	}

}
