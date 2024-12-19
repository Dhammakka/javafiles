package Basics;

public class StringPalindrome {

	public static void main(String[] args) {
		String str="dhammu";
		String rev="";
	
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
   System.out.println("Reversed String is:" +rev);
	
   String org_str=str;
   if(org_str.equals(rev))
   {
	   System.out.println("String is palindrome");
   }
   else
   {
	   System.out.println("String is not palindrome");
   }
	}

}
