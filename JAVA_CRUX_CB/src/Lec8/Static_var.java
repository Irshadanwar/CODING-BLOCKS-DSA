package Lec8;

public class Static_var {
	static int val = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p  = 9;
		fun(8, 5);
		System.out.println(val);

	}
	public static void fun(int x, int y) {
		x = x + 9;
		System.out.println(x);
		System.out.println(val);
		int val = 9;
		Static_var.val = Static_var.val + 6;
		System.out.println(val);

	}

}




/*
 * This program demonstrates the use of static (class-level) and local variables in Java.
 * 
 * Key Concepts:
 * 1. 'static' keyword:
 *    - Declares class-level variables that are shared among all instances of the class.
 *    - Here, 'static int val = 100;' is a global/static variable.
 * 
 * 2. Local Variables:
 *    - Declared inside methods.
 *    - Exist only within the method scope.
 *    - 'int val = 9;' inside 'fun()' shadows the static 'val' locally.
 * 
 * Code Flow:
 * - main() calls fun(8, 5)
 * - fun() updates and prints local 'x', then prints static 'val'
 * - Declares local 'val' = 9 (this hides the static one in local scope)
 * - Updates static 'val' using 'Static_var.val = ...'
 * - After fun(), main() prints the updated static 'val'
 * 
 * Output demonstrates:
 * - Difference between local and static/global variables
 * - How static variables retain changes across method calls
 */
