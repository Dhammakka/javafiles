package Basics;

public class revString {

	public static void main(String[] args) {
		String name="dad";
		
		String rev="";
		String org_str=name;
		int len=name.length();
		for (int i=len-1;i>=0;i--)
			rev=rev+name.charAt(i);
		    System.out.println("rev String is:"+ ""+rev);
	

		if(org_str.equals(rev))
	{
		System.out.println("String is Palindrome");
	}
else 
{
	System.out.println("String is not Palindrome");
}
	}
}
	


