package Dhammu;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=123215;
		int rev=0;
		int org_num=num;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(org_num==rev)
			
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}

	}

}
