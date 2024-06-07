package com;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfEachChar {

	public static void main(String[] args) {
		String str = "Jayshree";
		Map<Character,Integer> CharCount=new LinkedHashMap<>();
		
		// Jayshree
		for (int i=0; i < str.length(); i++)
		{
			Character ch = str.charAt(i);
			if (CharCount.containsKey(ch))
			{
				CharCount.put(ch,CharCount.get(ch)+1);
			}
			else
			{
				CharCount.put(ch,1);
			}
		}
		System.out.println(CharCount);

	}

}
