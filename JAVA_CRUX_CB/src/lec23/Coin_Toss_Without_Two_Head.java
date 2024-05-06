package lec23;

public class Coin_Toss_Without_Two_Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		printWays(n,"");
	}

	private static void printWays(int n, String ans) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.println(ans+" ");
			return;
		}
		if (ans.length()== 0 || ans.charAt(ans.length()-1) != 'H')
		printWays(n-1,ans + "H");
		printWays(n-1,ans + "T");
		
	}

}
