package practice.dsa.arrays;

import java.util.Arrays;

public class Array05_swapping_numbers_Array {
	
   public static void main(String[] args) {
	
	   // first upon the swapping of numbers means swap their positions using the indicess 
	   
	   int [] arr= {1,2,9,4,3};
	   
	   swap(arr,0,4);
	   
	   //System.out.println(Arrays.toString(arr));
	  
	   System.out.println(Arrays.toString(arr));
	   
}
    
   public static void swap(int [] arr, int index1, int index2)
   {
	   //Always remember this logic for the Swapping numbers and its also Easy for remember
	   
	   int temp= arr[index1];
	   
	   arr[index1] = arr[index2];
	   
	   arr[index2] = temp;
	    
   }

}
