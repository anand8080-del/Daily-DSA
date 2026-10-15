package practice.dsa.arrays;

import java.util.Arrays;

public class Array11_FindSecondHighest {
	
	public static void main(String[] args) {
		
	
	// find the second Highest Number in Array
    // for the finding a second Highest Number we need first sort the array
	
	int[] arr = {12,342,3425,3552,253253,325,25,53253,253,523,53,253,52,-2746,72136,-216,72,-187324};
	
	secondHighest(arr);
	}
	
	public static void secondHighest(int [] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
		     for(int j=i+1;j<arr.length;j++)
		     {
		    	 if(arr[i]>arr[j])
		    	 {
		    		 int temp = arr[i];
		    		 
		    		 arr[i] = arr[j];
		    		 
		    		 arr[j] = temp;
		    	 }
		     }
		}
		
		System.out.println("Sorted Array: "+Arrays.toString(arr));
		//finding a second Highest Number 
		
	    int highest = arr[arr.length-1];
	    
	    int secondhighest = arr[arr.length-2];
	    
	    System.out.println("the second Hieghest Number is: "+highest);
	    
	    System.out.println("the second hieghest number is: "+secondhighest);
	}

}
