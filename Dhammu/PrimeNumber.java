package Dhammu;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=8;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("number is not prime");
				break;
			}
			else
				{
		        System.out.println("number is prime");
		        break;
		        }
		}

	}

}