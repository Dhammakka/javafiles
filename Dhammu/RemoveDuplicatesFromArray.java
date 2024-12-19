package Dhammu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int a[]= {12,34,34,67,2,2,98};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);
		//Integer b[]=set.toArray(new Integer [set.size()]);
		//System.out.println(Arrays.toString(b));

	}

}
