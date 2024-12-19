package Demo;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharactersAlongWithNumbers {

	public static void main(String[] args) {
		
		String s="Dhammakka";
		char[] ch=s.toCharArray();
		
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		
		for(Character c:ch)
		{
			if(m.containsKey(c))
			{
				m.put(c,m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
		}
		for(Character c:m.keySet())
		{
			if(m.get(c)>=1)
			{
				System.out.println(c+m.get(c));
			}
		}

	}

}
