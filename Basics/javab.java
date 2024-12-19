package Basics;

public class javab {

	public static void main(String[] args) {
	//String is an object that represents sequence of characters
		String s= "Rahul Shetty Academy";
		String s1="Rahul Shetty Academy";
		String s2=new String("welcome");
		String s3=new String("welcome");
		String s4="hello";
		String s5="Dhammakka Pandav Engineer";
		//Remove whitespace from string
		String [] SplittedString= s5.split(" ");
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		System.out.println(SplittedString[2]);
		//or Remove pandav from string
		String [] SplittedString1= s5.split("Pandav");
		System.out.println(SplittedString1[0]);
		System.out.println(SplittedString1[1]);
		System.out.println(SplittedString1[1].trim());
		//Print all the characters in the string
		for(int i=0;i<s5.length();i++)
		{
			System.out.println(s5.charAt(i));
		}
		//Print all strings in reverse order
		for(int i=s5.length()-1;i>=0;i--)
		{
			System.out.println(s5.charAt(i));
		}

	}

}
