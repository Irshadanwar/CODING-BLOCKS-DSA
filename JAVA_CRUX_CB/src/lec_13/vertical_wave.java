package lec_13;
public class vertical_wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr={ {1,2,3,4,5}, {6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20} };
		waveDisplay(arr);
	}
	public static void waveDisplay(int [][] arr) {
		for (int col=0;col<arr[0].length;col++) {
			if (col%2==0) {
				for (int row=0;row<arr[0].length;row++) {
					System.out.print(arr[row][col]+" ");
				}
			}else {
				for (int row=0;row<arr[0].length;row++) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}
	}

}
