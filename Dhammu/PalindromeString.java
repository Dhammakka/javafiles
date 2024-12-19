package Dhammu;

public class PalindromeString {
   
	public static void main(String []args)
	{
		String s="MadaM";
		String rev="";
		String org_String=s;
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(org_String.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
