package Lec_24;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int des = 4;
		int curr=0;
		PrintPath(0,des,"");
	}

	public static void PrintPath(int curr, int des , String ans) {
		// TODO Auto-generated method stub
		if (curr == des) {
			System.out.print(ans+" ");
			return ;
		}
		if(curr>des) {
			return ;
		}
		
		PrintPath(curr+1,des,ans+1);
		PrintPath(curr+2,des,ans+2);
		PrintPath(curr+3,des,ans+3);
	}

}
