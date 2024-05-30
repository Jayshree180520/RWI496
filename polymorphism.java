package com;

//                            Polymorphism 

// ====>    Polymorphism means "many forms", and it occurs when we have many classes that are 
// related to each other by inheritance.

// two type of polymorephism
//  i) compile time plymorphism (method overloading)
//  ii) runtime polymorphism

         //                 i) Compile time polymorphism (method overloading)
/*
class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}

	class polymorphism {
	  public static void main(String[] args) {
	    Animal myAnimal = new Animal();  // Create a Animal object
	    Animal myPig = new Pig();  // Create a Pig object
	    Animal myDog = new Dog();  // Create a Dog object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	  }
		

	}
*/


//                               ii) Run time polymorphism (method overriding)

//          ===>   Method overriding is one of the ways by which Java achieves Run Time Polymorphism. 
//   The version of a method that is executed will be determined by the object that is used to invoke it. 
//   If an object of a parent class is used to invoke the method, then the version in the parent class will
//   be executed, but if an object of the subclass is used to invoke the method, then the version in the 
//   child class will be executed.

//Java program to demonstrate
//method overriding in java

//Base Class
class Parent {
	void show() { System.out.println("Parent's show()"); }
}

//Inherited class
class Child extends Parent {
	// This method overrides show() of Parent
	@Override void show()
	{
		System.out.println("Child's show()");
	}
}

//Driver class
class polymorphism {
	public static void main(String[] args)
	{
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Parent obj1 = new Parent();
		obj1.show();

		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent obj2 = new Child();
		obj2.show();
	}
}










