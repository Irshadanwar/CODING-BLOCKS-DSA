package Lec_15;

public class String_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=("hello");
		 s = s +"bye";//after concatenation it will be out of pool
		 String s1= new String ("hello");
		 s1=s1+"bye";
		 System.out.println(s1);
		 
		 String s2 = "hello" + "bye";
		 String s3 = "hello" + "bye";
		 System.out.println(s2 == s3);
		 //mutable immutable
		 //pool mein kab banta hai
	}
}
