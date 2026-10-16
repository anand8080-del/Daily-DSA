package practice.dsa.arrays;

import java.util.Arrays;

public class Array14_Sorting {
	
	public static void main(String[] args) {
		
		int[] arr = {12,3,3,34,4324,532,32,235,34,6,4,64,4,643,6};
		
		sorting(arr);
	}
	
	public static void sorting(int[] arr )
	{
	     int i=0;
		
		for(int j=1;j<arr.length;j++)
		{
			if(arr[i] > arr[j])
			{
				int temp = arr[i];
				
				arr[i] = arr[j];
				
				arr[j] = temp;
			}
			
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	

}
