package Basics;

import java.util.ArrayList;
import java.util.List;

public class arrays2 {

	public static void main(String[] args) {
	
		int [] arr= {2,5,8,7,9,4,10,6,12};
		//2,4,6,8,10,12
		//Check if array has multiple of 2
		for(int i=0;i<arr.length;i++)

		{
			if (arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
				break;
			}
			else 
			{
				System.out.println(arr[i]+ " is not multiple of 2");
			}
		}
        
		
		List<String> a=new ArrayList<String>();
		a.add("rahul");
		a.add("Pandu");
		a.add("Selenium");
		a.add("Dhammu");
		System.out.println(a.get(2));
		
		for(int i=0; i<a.size();i++) //in normal array we use length() method but in arraylist we use size() method
		{
			System.out.println(a.get(i));
		}
		System.out.println("***************");
		for (String s:a)
		{
			System.out.println(s);
		}
		
		//item is present in ArrayList
		System.out.println(a.contains("Selenium"));
		//for normal array ("name") also we can use the arrayList() methods
//		String [] name= {"Dhammakka","Pandav", "Selenium"};
//		 List<String> nameArrayList=Arrays.asList(name);
//		 nameArrayList.contains("Selenium");
		
		}
			
		
		}


