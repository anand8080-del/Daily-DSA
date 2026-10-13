package practice.dsa.arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Array3_2D_Array_Userinput {
	public static void main(String[] args) {
		
		
		System.out.println("please enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int[3][3];
		
		int num=sc.nextInt();
		
		//this is my input side 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=num*2;
				num--;
			
		    }
			
		}
		
     // this is for the my output	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j] +" ");
		}
		
		System.out.println();
	}
	
}
	
	
}
