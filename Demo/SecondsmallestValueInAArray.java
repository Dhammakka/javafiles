package Demo;

public class SecondsmallestValueInAArray {

	public static void main(String[] args) {
		int a[]= {10,15,20,30,40,50};
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				secondSmallest=smallest;
				smallest=a[i];
						
			}
			//else if(a[i]>secondSmallest&&a[i]!=smallest))
			else if(a[i] < secondSmallest && a[i] != smallest)
              {
	              secondSmallest=a[i];
              }

			}
		
     System.out.println("second smallest number in array:"+secondSmallest);
	}

}

