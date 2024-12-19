package Dhammu;

public class EvenAndOddNumbersFromArray {

	public static void main(String[] args) {
	
		int a[]= {12,5,6,9,8,32};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even number:"+a[i]);
			}
			else
			{
				System.out.println("Odd number:"+a[i]);
			}
		}
	}

}
