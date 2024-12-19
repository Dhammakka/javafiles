package Dhammu;

public class MaxandMinNumberInarray {

	public static void main(String[] args) {
		
		int a[]= {10,89,7,45,6};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max element in array:"+max);
		System.out.println("min element in array:"+min);
	}

}
