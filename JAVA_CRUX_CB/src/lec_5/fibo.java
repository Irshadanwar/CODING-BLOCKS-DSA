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
