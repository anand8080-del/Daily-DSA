package practice.dsa.arrays;

public class Array09_Sum_Avg_Array {

	public static void main(String[] args) {
		
		// calculate the sum and average of the elements inside the array
		
		int[] arr = {12,23,34,56,78,999,987};
		
		sum(arr);
		
	}
	
	public static void sum(int [] arr)
	{
		int sum=0;     
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		int avg= sum/arr.length;
		
		System.out.println("the total sum of the elements is: "+sum);
		
		System.out.println("the average of all Elements is: "+avg);
		
		
	}
}
