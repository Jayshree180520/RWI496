package com;
   
// Difference between abstract method and conscrete method

// Abstract methods provide a common interface that multiple classes can implement with their own
// unique behavior, facilitating polymorphism. Concrete methods, on the other hand, provide default
// functionality that can be shared among all derived classes, promoting code reuse and simplifying 
// maintenance.

                                      //Concretemethod
//  ==>  provide default functionality that can be shared among all derived classes, promoting code 
//          reuse and simplifying maintenance.
/*
 
 
 // Example 1:- 
  
abstract class Demo{
abstract void show();
void view() {
System.out.println("this is concrete method of abstract");	  
}
}
class Start extends Demo{

@Override
void show() {
System.out.println("this is :- ");
} 
}
public class ConscreteMethod {

public static void main(String[] args){
Start s= new Start();
// calling an object of the start class
s.show();
// calling the concrete method
s.view();
}

}
*/  

//  Examples 2 ;-

//Java program to illustrate concrete class 

//Concrete Class 
class ConscreteMethod { 

	// this method calculates 
	// product of two numbers 
	static int product(int a, int b) 
	{ 
		return a * b; 
	} 

	// this method calculates 
	// sum of two numbers 
	static int sum(int a, int b) 
	{ 
		return a + b; 
	} 

	// main method 
	public static void main(String args[]) 
	{ 
		int p = product(5, 10); 
		int s = sum(5, 10); 

		// print product 
		System.out.println("Product:= " + p); 

		// print sum 
		System.out.println("Sum:= " + s); 
	} 
} 





















