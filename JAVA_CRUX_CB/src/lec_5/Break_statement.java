package lec5;

import java.util.*;

public class Break_statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count += 1;
				break;
				
			}
		}
		if (count == 1) {
			System.out.println("Composite");
		} else {
			System.out.println("prime");
		}

	}

}
