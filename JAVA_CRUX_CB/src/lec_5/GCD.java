package lec_5;

import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		int divident = sc.nextInt();
		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
	}

}




/* in short :


package lec5;

import java.util.*;

public class a_Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = Math.min(a, b);
		int gcd = 1;
		for (int i = 2; i <= c; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}


more optimise: 

package lec5;

import java.util.*;

public class a_Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = Math.min(a, b); 
		int gcd = 1; 

		// Start checking from the largest possible divisor
		for (int i = c; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;  // Found the GCD, update and break
				break;  // Exit the loop early since we've found the greatest divisor
			}
		}

		System.out.println(gcd);
	}
}

Explanation:
Optimization: The loop starts from the smallest number (using Math.min(a, b)) and goes downwards. This allows you to find the GCD as soon as possible, reducing unnecessary checks.
Exit early: As soon as you find a divisor that works, you can break out of the loop — no need to check smaller numbers.

*/
