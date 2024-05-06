package Lec_49;

public class Maximum_subsum_Window_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 7, 5, 11, 3, 2, 1 };
		int k = 3;

	}

	public static int MaximumSum(int[] arr, int k) {

		int sum = 0;
		// 1st first window
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}

		int ans = sum;
		// sliding window
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];// window grow
			sum -= arr[i - k];// window small
			ans = Math.max(ans, sum);// ans update
		}
		return ans;

	}
}
