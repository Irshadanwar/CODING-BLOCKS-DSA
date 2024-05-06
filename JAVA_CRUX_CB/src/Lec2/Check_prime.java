package Lec2;

import java.util.*;

public class Check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc= new Scanner(System.in);
		long n = sc.nextInt(),i = 2,fact=0;
		while (i<n) {
			if(n%i==0){
			   fact++;
			   break;
			}
		    i++;
		}
		if (fact>0 ) {
			System.out.println("Composite");
			
		} else {
			System.out.println("prime");
		}
	}
}
