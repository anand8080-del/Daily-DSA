package practice.dsa.arrays;

public class Array15_Find_Missing_Number {
	
	public static void main(String[] args) {
		
		//Find the missing number in Array
		// one more logic for this code with the help of XOR Operator 
		
		int[] arr = {1,2,3,4,5,6,7,9};    // get sum of all the elements   that is actual value 
		
		findMissing(arr);
		
	}
	
	public static void findMissing(int[] arr)
	{
		
		int actualSum = 0;         
		
		int expectedSum =0;
		
		for(int i=0;i<arr.length;i++)             // this will give you Actual Sum
		{
			actualSum=arr[i]+actualSum;
		}
		
		
		for(int i=1; i<=9; i++)                // this will give you expected sum 
		{
			expectedSum+=i;
		}
		
		int missingNumber =expectedSum-actualSum;    // finally minus them and get a missing number 
		
		System.out.println("Missing Number is: "+missingNumber);
	}

}
