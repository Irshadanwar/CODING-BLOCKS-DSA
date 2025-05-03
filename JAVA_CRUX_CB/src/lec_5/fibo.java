package lec_5;
import java.util.Scanner;
public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int a = 0;
		int b = 1;
		int i = 1;
		while (i <= n) {
			int c = a + b;
			a = b;
			b = c;
			i++;
		}
		System.out.println(a);
	}

}




/* using for loop:

package lec5;

import java.util.*;

public class fibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0, b=1, c=0;
		for (int i = 0; i < n; i++) {
			c = a+b;
			a=b;
			b=c;
			
		}
		System.out.println(a);
		

	}

}
*/
