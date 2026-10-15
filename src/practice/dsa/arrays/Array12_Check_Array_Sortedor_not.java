package practice.dsa.arrays;

public class Array12_Check_Array_Sortedor_not {
	
	public static void main(String[] args) {
		
		// check whether Array is Sorted or Not if Array Sorted Then Return True OtherWise return false
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		logic(arr);
		
	}
	
	public static void logic(int [] arr)
	{
		
		boolean flag= true;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			     if(arr[i] > arr[j])
			     {
			    	flag=false;
			     }   
			}
		}
		
		if(flag==false)
		{
			System.out.println("this Array is not Sorted: " + flag);
		}
		else 
		{
			System.out.println("this array is Sorted: " + flag);
		}
			
	}

}
 