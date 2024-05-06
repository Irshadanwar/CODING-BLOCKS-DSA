package lec1;

public class Prime_Factorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int i=2;
		while(n>1)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
			i++;
		}
	}

}
