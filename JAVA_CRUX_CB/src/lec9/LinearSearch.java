package lec9;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for (int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int item = sc.nextInt();
		System.out.println(Search(arr,item));
	}

	public static int Search(int[] arr, int item) {
		for(int i=0;i<arr.length;i++) {
			if (item==arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
