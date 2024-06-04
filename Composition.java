package com;

import java.io.*;
	
//Java Program to Illustrate
//Composition

//Importing I/O classes

//Class 1
//Engine class which will be used by car.

class Engine {

 // Method to start the engine
	
 public void work()
 {
     // Print statement whenever this method is called
     System.out.println("Engine of car has been started ");
 }
}

//Class 2
//Car class
class Car {

 // For a car to move,
 // it needs to have an engine.
	
 private final Engine engine;

 // Constructor of this class
 
 public Car()
 {
     this.engine = new Engine();   // Composition
 }

 // Method
 // Car start moving by starting engine
 
 public void move()
 {
     engine.work();
       System.out.println("Car is moving");
 }
}

//Class 3
//Main class
class Composition {

 // Main driver method
	
 public static void main(String[] args)
 {
     // Creating a car object, 
     // which will also initializes the engine class object
	 
     Car car = new Car();

     // Making car to move by calling
     // move() method inside main()
     
     car.move();
 }
}



