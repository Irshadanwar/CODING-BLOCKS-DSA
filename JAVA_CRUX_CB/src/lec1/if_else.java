package lec1;

import java.util.*;

public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc= new Scanner(System.in);
		int N = sc.nextInt();
        if (N%2==0) {
            if (N>2 && N<6) {
                System.out.println("Not Weird");
            }
            else if (N>5 && N<21) {
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Weird");
        }

	}

}
