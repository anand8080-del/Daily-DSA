package practice.dsa.arrays;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str = "madam";
		
	     int first=0;
	     
	     int second=str.length()-1;
	     
	     
	     
	     while(first <= second)
	     {
	    	if(str.charAt(first)!=str.charAt(second))
	    	{
	    		
	    		System.out.println("String is not a Palindrome");	
	    		return;
	    		
	    	}
	    	
	    	
	    	first++;
	    	second--;
	     }
		
	       
			System.out.println("String is a Palindrome");	
	}

}
