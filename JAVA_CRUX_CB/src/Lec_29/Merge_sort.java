package Lec_29;

public class Merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7,5,1,4,2,-1};
		int [] ans = mergesort(arr, 0, arr.length-1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}

	public static int [] mergesort(int []arr,int si,int ei) {
		if(si==ei) {
			int [] bs = new int [1];
			bs[0]=arr[si];
			return bs;
		}
		int mid = (si+ei)/2;
		int [] fs = mergesort(arr, si, mid);
		int [] ss = mergesort(arr, mid+1, ei);
		return mergetwosortedArray(fs,ss);
	}
	public static int[] mergetwosortedArray(int[] arr, int[] arr1) {
		int n = arr.length;
		int m = arr1.length;
		int[] ans = new int[n + m];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n && j < m) {
			if (arr[i] < arr1[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			} else {
				ans[k] = arr1[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while (j < m) {
			ans[k] = arr1[j];
			j++;
			k++;
		}
		return ans;
	}

}
