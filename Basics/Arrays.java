package Basics;

public class Arrays {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		//or
		
		int [] arr2= {1,2,3,4,5};
		//System.out.println(arr2[2]); 
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		String[] name= {"Dhammakka", "Pandav", "Selenium"};
		for(int i=0; i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		//or Enhanced for loop
		
		for(String s:name)
		{
			System.out.println(name);
		}
		

	}

}
