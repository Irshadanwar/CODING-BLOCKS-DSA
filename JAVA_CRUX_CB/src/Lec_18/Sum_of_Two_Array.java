
package Lec_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Sum_of_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();        
        int[] arr1 = new int[m];        
        for(int i=0;i<m;i++)
        {
            arr1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for(int j=0;j<n;j++)
        {
            arr2[j] = sc.nextInt();
        }
		SumofTwoArray(arr1,arr2);
		
	}
	public static void SumofTwoArray(int []arr1,int []arr2) {
		int i=arr1.length-1;
		int j=arr2.length-1;
		ArrayList<Integer> list = new ArrayList<>();
		int carry=0;
		while (i>=0 && j>=0) {
			int sum=arr1[i]+arr2[j]+carry;
			list.add(sum%10);
			carry = sum/10;
			i--;
			j--;
		}
		while (i>=0) {
			
			
			int sum=arr1[i]+carry;
			list.add(sum%10);
			carry = sum/10;
			i--;
		}
		while (j>=0) {
			int sum=arr2[j]+carry;
			list.add(sum%10);
			carry = sum/10;
			j--;
		}
		if(carry!=0) {
			list.add(carry);
		}
		Collections.reverse(list);
		for (int k=0;k<list.size();k++) {
			System.out.print(list.get(k)+", ");
		}
		System.out.println("END");
	}
	
	
	
	
}
