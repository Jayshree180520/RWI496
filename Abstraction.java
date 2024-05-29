package com;

//Abstraction is a a process of hiding the implementation details from the users only heighlighted set
	// of services provided to the users.
	// Abstraction can achieved with either i) Abstract class ii) Interface
	
	// Abstract class = A class which contain the abstract keywords in its declaration is called abstract class.
	// NOTES== i) we cannot create object for abstract class 
	//        ii) It may or may not contain abstract methods.
	//        iii) It can have abstract and non abstract methods
	//         iv) To use an abstract class you have to inherit if from sub classes.
	//         v) If a class contain partial implementation then we should declare a class as abstract.
	
	        // Abstract class program
	abstract class animal
	{
		animal()
		{
			System.out.println("All animals..!");
		}
		public abstract void sound();
	}
	class Dog extends animal
	{
		Dog()
		{
			super();
		}
		public void sound()
		{
			System.out.println("Dog is barking");
		}
	}
	class Lion extends animal
	{
		Lion()
		{
			super();
		}
		public void sound()
		{
			System.out.println("Lion is Roar");
		}
	}
	public class Abstraction {
	
		public static void main(String[] args){
			Dog d= new Dog();
			Lion l = new Lion();
			d.sound();  l.sound();
		}
	
}
	



