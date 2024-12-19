package Dhammu;

import java.util.Scanner;

public class NoOfLettersDigitsSpaces {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Text");
		String s=sc.nextLine();
		char [] ch=s.toCharArray();
		int digits=0,spaces=0,letters=0,others=0;
		for(Character c:ch)
		{
			if(Character.isDigit(c))
			{
				digits++;
			}
			else if(Character.isLetter(c))
			{
				letters++;
			}
			else if(Character.isSpaceChar(c))
			{
				spaces++;
			}
			else 
			{
				others++;
			}
		}
		System.out.println("no of Digits:"+digits);
		System.out.println("no of Letters:"+letters);
		System.out.println("no of Spaces:"+spaces);
		System.out.println("no of others:"+others);
		

	}

}
