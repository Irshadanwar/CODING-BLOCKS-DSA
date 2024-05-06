package lec_21;

import java.util.Scanner;

public class Array_1st_Occr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int item = sc.nextInt();
		System.out.println(Index(arr, item, 0));

	}

	public static int Index(int[] arr, int item, int idx) {
		// TODO Auto-generated method stub
		if (idx == arr.length) {
			return -1;
		}
		if (item == arr[idx]) {
			return idx;
		}
		return Index(arr, item, idx + 1);

	}

}
//input 5 
//11 4 13 5 3
//4
//output
//1