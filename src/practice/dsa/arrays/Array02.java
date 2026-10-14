package practice.dsa.arrays;

import java.util.Arrays;

public class Array02 {
	
	public static void main(String[] args) {
		
		// create a 2D Array
		
		int [] [] arr = new int[3][3];   
		
		int num=1;
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				arr[i][j]=num;
				System.out.print(arr[i][j]+" ");
				num++;
			}
			System.out.println();
			
		}
		
	}                                       

}
