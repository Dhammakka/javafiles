package Dhammu;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		
		int [] n1= {12,10,89,50,3};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<n1.length;i++)
		{
			if(n1[i]>largest)
			{
				secondLargest=largest;
				largest=n1[i];
				
			}
			else if ((n1[i]>secondLargest&&n1[i]!=largest))
			{
				secondLargest=n1[i];
			}
		}
		System.out.println("Second largest number in a array:" +secondLargest);

	}

}
