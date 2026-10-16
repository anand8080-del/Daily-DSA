package practice.dsa.arrays;

import java.util.Arrays;

public class Array13_move_all_0_at_End {
	
	public static void main(String[] args) {
		
		// move all the elements at the End in Array
		
		int[] arr1 = {0,12,23,4,56,0,9,65,0,67,06436,0,54,057,0,4333,956,0,4,67};
		
		moveZero(arr1);
		
	}
	
	
	public static void moveZero(int [] arr1)
	{
	     for(int i=0;i<arr1.length;i++)
	     {
	    	 for(int j=i+1;j<arr1.length;j++)
	    	 {
	    		 if(arr1[i]==0)
	    		 {
	    			 int temp = arr1[i];
	    			 
	    			 arr1[i] = arr1[j];
	    			 
	    			 arr1[j] = temp;
	    		 }
	    	 }
	     }
	     
	     System.out.println(Arrays.toString(arr1));
	}

}
