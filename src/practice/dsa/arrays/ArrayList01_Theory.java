package practice.dsa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01_Theory {
	
	public static void main(String[] args) {
//		
//		•	ArrayList is the member of of the Collection 
//		•	The parent class of the ArrayList is List
//		•	The Intitial capacity of ArrayList is 10 and that is increases Automate
//		•	New Capacity = old capacity + old Capacity/2 Arralist Grow in this manner
//		•	Main difference Between Array and ArrayList is Array has Fixed Size and ArrayList has not fixed Size 

		
		ArrayList<Integer> arrayList =   new ArrayList<Integer>();
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		
		System.out.println(arrayList);
			
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=[");
		
		
		//Take User Input in ArrayList
		
		System.out.println("Enter 5 Elements as a Input");
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			list.add(in.nextInt());
		}
	
		System.out.println(list);
	}
	
	
	
	

}
