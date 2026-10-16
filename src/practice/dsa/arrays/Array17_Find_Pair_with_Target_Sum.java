package practice.dsa.arrays;

import java.util.Arrays;

public class Array17_Find_Pair_with_Target_Sum {
	
	public static void main(String[] args) {
		
		//Count the Frequency of Each Element
		
		int[] arr = {12,33,44,33,44,44,34,43,34,43,44,43};
		
		boolean[] visitedNum = new boolean[arr.length];   // Default this array all elements are false
		
		System.out.println(Arrays.toString(visitedNum));
		
		frequency(arr, visitedNum);
		
		System.out.println(Arrays.toString(visitedNum));   // if element repeat flag change to true 
		
	}
	
	public static void frequency(int[] arr, boolean[] visitedNum)
	{
		
		for(int i=0;i<arr.length;i++)
		{   
			if(visitedNum[i]==true)
			{
				continue;            // if element true coming means Repeated then Skip the Iteration Because of this used continue and again comes next element 
			}
			
			int freq=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					freq++;
					visitedNum[j] = true;
					
				}
			}
			
			System.out.println("Element is: "+arr[i] + " Frequency is: "+freq);
		}
	}
}
 