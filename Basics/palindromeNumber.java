package Basics;

public class palindromeNumber {

	public static void main(String[] args) {
		int num=123121;
		 int org_num=num;
		  int rev=0;
		  while(num>0)
		  {
			  rev=(rev*10)+num%10;
			  num=num/10;
		  }
		  System.out.println("Reversed number is:" +rev);
		  

		if(org_num==rev)
		{
			System.out.println(+rev + " Number is palindrome");
		}
		else
		{
			System.out.println(+rev + " Number is not palindrome");
		}

	
	}
}
