package Lec10;

import java.util.Scanner;

public class Inverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input:5
		//0 2 4 1 3
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			}
		inverse(arr);
	}

	public static void inverse(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int[] arr2 = new int[n];
		for(int i=0;i<n;i++)
		{
			arr2[arr[i]] = i; 
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		//0 3 1 4 2
		
	}

}
