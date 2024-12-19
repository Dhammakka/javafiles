package Basics;

public class revString1 {

	public static void main(String[] args) {
		String str="Dhammakka";
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
System.out.println("Reversed String is:" +rev);
	}

}


