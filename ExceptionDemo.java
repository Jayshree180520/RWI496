package com;

public class ExceptionDemo {


			public static void main(String[] args) {
		/*		
				 int a=5; 
			      int b=0; 
			        try{ 
			          System.out.println(a/b); 
			        } 
			      catch(ArithmeticException e){ 
			        System.out.println(e.toString()); 
			      } 
		*/	     
			
						
				
				
	
				System.out.println("1");
				
				try {
					System.out.println("2");
					int a=100,b=0,c;
					System.out.println("3");
					c=a/b;
					System.out.println("4");
					System.out.println(c);
					
				}
				catch (Exception e) {
					e.printStackTrace();
					System.out.println("5");
					System.out.println("c");
					System.out.println("6");
					// TODO: handle exception
				}
				System.out.println("Railworld");
		

			}	

	}


