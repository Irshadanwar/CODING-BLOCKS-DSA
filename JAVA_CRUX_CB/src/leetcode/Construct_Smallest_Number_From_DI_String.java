package leetcode;

import java.util.Stack;

//2375. Construct Smallest Number From DI String
public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "DDIIDID";
		String k =Number_From_DI(s);
		System.out.println(k);
	}
	public static String Number_From_DI(String s)
	{
		Stack<Integer> st = new Stack<>();
		int count =1;
		int[] ans = new int[s.length()+1];
		for (int i = 0; i <= s.length(); i++) {
			if(i== s.length() || s.charAt(i) == 'I')
			{
				ans[i] = count;
				count++;
				while(!st.isEmpty())
				{
					ans [st.pop()] = count;
					count++;
				}
			}
			else
			{
				st.push(i);
			}
		}
		String str = "";
		for (int i = 0; i < ans.length; i++) {
			str += ans[i];
		}
		return str;
	}

}
