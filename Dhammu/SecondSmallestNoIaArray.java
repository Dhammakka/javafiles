package Dhammu;

public class SecondSmallestNoIaArray {

	public static void main(String[] args) {
		int [] n1= {12,10,89,67,9,3};
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<n1.length;i++)
		{
			if(n1[i]<smallest)
			{
				secondSmallest=smallest;
				smallest=n1[i];
				
			}
			else if ((n1[i]>secondSmallest&&n1[i]!=smallest))
			{
				secondSmallest=n1[i];
			}
		}
		System.out.println("Second largest number in a array:" +secondSmallest);


	}

}
