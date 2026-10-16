package practice.dsa.arrays;

public class Array16_Find_Duplicate {
	public static void main(String[] args) {
		
		int[] arr = {1,6,2,3,4,5,6,7,8,8};
		
		System.out.println("the duplicate numbers is: ");
		
		findDuplicate(arr);
		
	}
	
	public static void findDuplicate(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

}
