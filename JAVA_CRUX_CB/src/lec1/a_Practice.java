package lec1;

import java.util.*;

public class a_Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),i = 2,fact=0;
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