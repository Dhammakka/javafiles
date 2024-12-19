package Dhammu;

import java.util.Arrays;

public class AnangramString {
	public static boolean  isAnangram(String str1,String str2)
	{
	str1=str1.replaceAll("\\s","").toLowerCase();
	str2=str2.replaceAll("\\s","").toLowerCase();
	
	if(str1.length()!=str2.length())
	{
		return false;
	}
	char ch1[]=str1.toCharArray();
	char ch2[]=str2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	return Arrays.equals(ch1, ch2);
		
	}

	public static void main(String[] args) {
		
     String string1="listen";
     String string2="silent";
     
     if(isAnangram(string1, string2))
     {
    	 System.out.println(string1+" and "+string2+" are anagram");
     }
     else
     {
    	 System.out.println(string1+" and "+string2+" are not anagram");
     }
	}

}
