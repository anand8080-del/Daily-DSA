package practice.dsa.arrays;

public class Array4_Find_the_Largest_Element {
	
	public static void main(String[] args) {
		
		//find the largest Elements in Array
		// same opposite logic for the find the lowest number in Array
		
		int [] arr = {13,21,214,412,1,2142,414,-1242,-21,124,124,123,122};
		
		int num=Integer.MAX_VALUE;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<num)
			{
				num=arr[i];
			}
		}
		
		System.out.println("The Highest number is: "+num);
	}

}
