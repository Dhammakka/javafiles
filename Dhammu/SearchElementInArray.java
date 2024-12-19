package Dhammu;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40};
		int searchElement=40;
		boolean found=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==searchElement)
			{
				found=true;
				System.out.println("Element found");
				break;
				
			}
		}
		    if(!found)
			{
				System.out.println("Element not found");
			}
		}

	}


