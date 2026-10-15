package practice.dsa.arrays;

import java.util.Arrays;

public class Array08_reverse_Array {
	
	public static void main(String[] args) {
	
	  // if you want to reverse the array with modify Actual Array
	 // if you want just print the Reverse Array then use that simple code 
		
		/*
		 * for(int i=arr.length-1; i>0; i--)
		 * {
		 *   Syso(arr[i])  this will return the array and print Out
		 * 
		 * }
		 * 
		 */
		
		
		int[] arr = {1,4,5,5,6,6,7,7,8,9,9};
		
	      reverse(arr);
	      
	    System.out.println(Arrays.toString(arr));
		
	}
	
	public static void reverse(int[] arr)
	{
		int first=0;
		int last=arr.length-1;       //last=10
		
		
		for(int i=0;i<arr.length;i++)    //in case of whole array reverse we need two pointers if we need to swap single number then no need of two pointers and for loop also 
		{
			
		if(first<last)
		{
			int temp = arr[first];  //   temp = 1 
			
			arr[first] = arr[last];     //arr[first] = 9      last comes first
			                                                                      // swap
			arr[last] = temp;           //arr[last] = 1       first going last  
			
		}
		   
		first++;
		last--;
		
		}
		
		
		
	}
	

}
 