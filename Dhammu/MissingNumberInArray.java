package Dhammu;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5};
		int sumWithoutmiss=0;
		int sumWithmiss=0;
		for(int i=1;i<=5;i++)
		{
			sumWithoutmiss=sumWithoutmiss+i;
		}
		for(int i=0;i<a.length;i++)
		{
			sumWithmiss=sumWithmiss+a[i];
		}
		System.out.println("Missing Element is array:" +(sumWithoutmiss-sumWithmiss));

	}

}
