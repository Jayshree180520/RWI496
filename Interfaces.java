package com;

//Interfaces:-
		// == interfaces is just like a class which contain only abstract methods.
		//     to achieve interface java provides a keywords called implements
		// NOTES == i) Interfaces methods are by default public and abstract
		//          ii) Interface variables are by default public + static + final
		//         iii) Interface method must be overriden inside the implementation classes
	    //          iv) Interface nothing but deals between client and developer
	
	      // Interfaces codes
/*	
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    // public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum ");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa ");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}
*/
//              OR


//Interface
interface Animal {
public void animalSound(); // interface method (does not have a body)
public void sleep(); // interface method (does not have a body)
}

//Pig "implements" the Animal interface
class Pig implements Animal {
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The pig says: wee wee");
}
public void sleep() {
 // The body of sleep() is provided here
 System.out.println("Zzz");
}
}

class Interfaces {
public static void main(String[] args) {
 Pig myPig = new Pig();  // Create a Pig object
 myPig.animalSound();
 myPig.sleep();
}
}
   














