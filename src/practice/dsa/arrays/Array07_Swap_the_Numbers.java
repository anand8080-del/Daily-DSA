package practice.dsa.arrays;

import java.util.Arrays;

public class Array07_Swap_the_Numbers {
	
	public static void main(String[] args) {
		
		int [] arr  = {721,587,216,21345};
		swap(arr, 0, 3);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] swap(int [] arr, int index1, int index2)
	{
		
		if(index1>arr.length-1 || index2>arr.length-1)
		{
			System.out.println("enter a valid Indexes");   // corner case , Edge case
		}
		
		if(arr.length<=0)
		{
			System.out.println("Check once you arraay");
		}
		
		int temp= arr[index1];    // 721     temp = 721 // temp is the temporary variable for the swapping
	    
	    arr[index1] = arr[index2];   //21345   arr[index1] = 21345
	    
	    arr[index2]=temp;           // arr[index2] = 721
	     
	    return arr;
	}

}
