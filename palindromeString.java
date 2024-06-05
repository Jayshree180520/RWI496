package com;

//A string is called a palindrome if the reverse of the string is the same as the original one.
//  Example: “madam”,


public class palindromeString {

	public static void main(String[] args) {
		String str = "Madam", reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	  }
	}


