package com;
import java.util.*;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
	 
		   
	// @param args the command line arguments
		    

		        
		        System.out.println("Enter an input string ");
		        
		        // Take an input
		 
		        Scanner in = new Scanner(System.in);
		        String str = in.nextLine();
		        
		        // Assign length of a string
		        int len = str.length();
		        
		        // HashMap implementation for key and value pair
		        HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();
		        
		        Character ch;
		        
		        /*Create a key and value pair for character and it's count. 
		          If there  is no value stored for a character then set it to 1. 
		          Else we increment the character value by 1 */
		 
		        for(int i = 0; i < len; i++) {
		            
		            ch = str.charAt(i);
		            
		            /* If character is already exists 
		               then increment it's count by 1 */
		 
		            if(charcount.containsKey(ch)) {
		                
		                charcount.put(ch, charcount.get(ch)+1);
		                
		            } else {
		                
		                // If character does not not exist
		                charcount.put(ch, 1);
		            }
		        }
		        
		        for (int j = 0; j < len; j++) {
		            
		            ch = str.charAt(j);
		            // Check character with value 1 (First non-repeated character)   
		            if(charcount.get(ch) == 1){
		                
		                System.out.println("First non-repeated character is " + ch);
		                break;
		                
		            }
		        }
		    }
		    
		}



