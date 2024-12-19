package Dhammu;

public class DuplicatesElementInArray {

	public static void main(String[] args) {
		
		int a[]= {12,4,5,6,4};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate element found:"+a[i]);
				}
			}
		}

	}

}
