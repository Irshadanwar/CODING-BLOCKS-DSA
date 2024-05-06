package lec9;

public class Swap_demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,4,5,6};
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr[0],arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
	}
	
	public static void Swap (int a, int b) {
		int temp = a;
		a=b;
		b = temp;
		
	}

}
