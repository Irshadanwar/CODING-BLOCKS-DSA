package Lec_7;
import java.util.*;
public class Inverse_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int pos = 1;
		
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + pos * Math.pow(10, rem - 1));
			pos++;
			n = n / 10;

		}
		System.out.println(sum);

	}

}
//int n = 32145 , sum =0 , a =1 ;
//while (n>0) {
//	int rem =n%10;
//	sum = (int) (sum+a*(Math.pow(10,rem-1)));
//	a++;
//	n=n/10;
//}
//System.out.println(sum);