package com;

// A string is called a palindrome if the reverse of the string is the same as the original one. 
//       Example: “madam”,


public class PalindromeInteger {

	public static void main(String[] args) {
		int num = 3553;
		int reversedNum = 0;
		int remainder;
	    
	    // store the number to originalNum
	    int originalNum = num;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num /= 10;
	    }
	 // check if reversedNum and originalNum are equal
	    
	    if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	  }
	

	
}
