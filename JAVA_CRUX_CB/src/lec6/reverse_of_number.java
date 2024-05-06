package lec6;
import java.util.*;
public class reverse_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0) {
        	int a = n%10;
        	System.out.print(a);
        	n=n/10;
        }
    }
}