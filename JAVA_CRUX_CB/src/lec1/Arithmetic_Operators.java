package lec1;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;
		int b=16;
		int c=a+b;
		System.out.println(c);
		System.out.println(a+b);
		//c=c+3;
		int x=5;
		System.out.println(x+=3);
		System.out.println(a*=2);
		System.out.println(a==b);
		int A=10;
		int B=8;
		int C=6;
		//AND OPERATOR
		System.out.println(A>B&&A>C);
		//OR OPERATOR
		System.out.println(B>A||B>C);
		//NOT OPERATOR
		System.out.println(B>A&&B>C);
	}

}
