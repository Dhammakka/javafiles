package Demo;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		
		String str="Dhammakka";
		int vowelsCount=0;
		int consonantCount=0;
		for(int i=0;i<str.length();i++)
		{
			 String s2=str.toLowerCase();
			char ch=s2.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || i=='u')
			{
				vowelsCount++;
			}
			else
			{
				consonantCount++;
			}
			
		}
		System.out.println("vowels are:"+vowelsCount);
		System.out.println("consonants are:"+consonantCount);

	}

}
