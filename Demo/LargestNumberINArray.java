package Demo;

public class LargestNumberINArray {

	public static void main(String[] args) {
		
		int a[]= {1,4,8,9,10};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max number in the array:" +max);

	}

}