package Lec12;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 18 };
		int item = 13;
		System.out.println(Search(arr, item));
	}

	public static int Search(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == item) {
				return mid;

			} else if (arr[mid] < item) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return -1;


	}

}
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//int arr[]=new int [n];
//for(int i =0 ; i<arr.length;i++) {
//	arr[i]=sc.nextInt();
//}
//int item =sc.nextInt();
//Arrays.sort(arr);//to sort the user input
//System.out.println(Search(arr,item));
//}
//
//public static int Search(int[] arr, int item) {
//// TODO Auto-generated method stub
//int low=0;
//int hi=arr.length-1;
//while(low<=hi) {
//	int mid=(low+hi)/2;
//	if (arr[mid]==item) {
//		return mid;
//	}else if (arr[mid]<item) {
//		low = mid + 1;
//	}else {
//		hi=mid-1;
//	}
//}
//return -1;
