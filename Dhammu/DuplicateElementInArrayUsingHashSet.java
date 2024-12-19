package Dhammu;

import java.util.HashSet;

public class DuplicateElementInArrayUsingHashSet {

	public static void main(String[] args) {
	int a[]= {12,34,34,9,9,0};
	HashSet<Integer> set=new HashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		if(set.add(a[i])==false)
		{
			System.out.println(a[i]+" is duplicated element in array");
		}
	}

}
	
}
