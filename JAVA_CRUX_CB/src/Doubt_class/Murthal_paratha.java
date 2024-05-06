package Doubt_class;

import java.util.Arrays;

public class Murthal_paratha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Paratha=10;
		int noc=4;
		int [] arr= {1,2,3,4};
		Arrays.sort(arr);

	}
	public static int minimumtime(int []arr,int parantha) {
		int lo=0;
		int hi= (arr[arr.length-1]*(parantha*(parantha+1)))/2;
		int ans=0;
		while (lo<=hi) {
			int mid = (lo+hi)/2;
			if (isitpossible(arr,mid,parantha)) {
				ans=mid;
				hi=mid-1;
			}else {
				lo = mid+1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] arr, int mid, int parantha) {
		return false;
	}

}
