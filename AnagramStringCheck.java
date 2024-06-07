package com;
import java.util.Arrays;

public class AnagramStringCheck {

	public static void main(String[] args) {
		String x = "ARADHYA";
		String y = "HRADHYA";
		char a[] = x.toCharArray();
		char b[] = x.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result = Arrays.equals(a, b);
		
		if (result == true)
		{
			System.out.println("Strins are anagram");
		}
		else
		{
			System.out.println("Strins are not anagram");
		}
		

	}

}
