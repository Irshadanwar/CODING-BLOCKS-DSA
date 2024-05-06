package lec_21;
import java.util.*;
public class Print_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		print(i);
	}

	private static void print(int i) {
		if (i==0) {
			return;
		}
		print(i-1);
		System.out.println(i);
	}

}
