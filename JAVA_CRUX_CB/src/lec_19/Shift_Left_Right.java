package lec_19;

public class Shift_Left_Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 10.2f;
		int x=15;
		System.out.println(x>>1);// right shift
		int a= -21;
		System.out.println(a >>1);// right shift
//		in negative case of odd we will
//		get a smaller value.
		System.out.println(a<<2);// left shift
		System.out.println(x<<2);// left shift
	}

}
