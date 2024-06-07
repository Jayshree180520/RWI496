package com;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String str = "Jayshree";
		System.out.println(removeDuplicates(str));
	}
	public static String removeDuplicates(String str)
	{
		Set <Character> Set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		for (int i=0; i<str.length(); i++)
		{
			Character c = str.charAt(i); // str.charAt(i) s
			if (!Set.contains(c))      // if is not present in hashset
			{
				Set.add(c);              // add to the set
				sf.append(c);              
			}
		}
		return sf.toString();
	}

}
