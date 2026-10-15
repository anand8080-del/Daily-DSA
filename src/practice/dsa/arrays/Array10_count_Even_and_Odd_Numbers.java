package practice.dsa.arrays;

public class Array10_count_Even_and_Odd_Numbers {
	
	
	public static void main(String[] args) {
		
	int[] arr = {1,2,3,4,5,6,7,8,9,20};
	
	count(arr);
	
	}
	
	public static void count(int [] arr)
	{
	    int even=0;
	    int odd =0;
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]%2==0)
	    	{
	    		even++;
	    	}
	    	else 
	    	{
	    		odd++;
	    	}
	    }
	    
	    System.out.println("the count of Even Numbers is: "+even);
	    System.out.println("the count of odd Numbers is: "+odd);
	}
}
