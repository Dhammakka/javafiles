package Demo;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int Largest=Integer.MIN_VALUE;
		int SecondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>Largest)
			{
				SecondLargest=Largest;
				Largest=a[i];
			}
	
			else
		{
			if((SecondLargest==a[i])&&(SecondLargest!=Largest))
			{
				SecondLargest=a[i];
			}
			
				
		}
		}
		System.out.println(SecondLargest);
	}

}
