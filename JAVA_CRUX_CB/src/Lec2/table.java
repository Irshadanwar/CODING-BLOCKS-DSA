package Lec2;

import java.util.*;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        
        while (a<=10) {
            System.out.print(n);
            System.out.print(" x ");
            System.out.print(a);
            System.out.print(" = ");
            System.out.println(n*a);
            a++;
        }

	}

}
