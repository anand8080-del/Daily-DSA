package practice.dsa.arrays;

import java.util.Arrays;

public class Array1 {
	
	public static void main(String [] args)
	{
		
		int [] arr = {10,20,30,40};
		
		String [] str = {"anand","anna","appa","sam","ram"};
		
	       
		
		Array1.change(arr, str);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(str));
		
		
		

	}
	
	
	
	public static void change(int [] arr,String [] str)
	{
		arr[0]=123;
	
	}

}
