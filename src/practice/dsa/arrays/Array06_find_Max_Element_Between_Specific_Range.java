package practice.dsa.arrays;

public class Array06_find_Max_Element_Between_Specific_Range {
	
	public static void main(String[] args) {
		
		// Find the Max element Between the range of 10 to 15 
		
		int [] arr = {12,32,3,2,32,432,4,21,421,241,4142,443,23,243,4321,3421,43214,34231,3143,31,54,7,858,68,8687,58};
		
		maxrange(arr,10,15);
		System.out.println("the maximum value is: ");
		System.out.println(Array06_find_Max_Element_Between_Specific_Range.maxrange(arr, 10, 15));
	}
	
	public static int maxrange(int []arr, int index1, int index2)
	{
		int max=Integer.MIN_VALUE;
		
		for(int i=index1;i<=index2;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		return max;
	}

}
