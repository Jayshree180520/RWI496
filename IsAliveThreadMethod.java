package com;
// isAlive method :- It is a pre-defined method of thread class through which we can verify weather a thread a isAlive or not.

class A extends Thread
{
	public void run()
	{
		System.out.println("IsAlive method program..!");
	}
}

public class IsAliveThreadMethod {

	public static void main(String[] args) {
		
		A t1= new A();
		A t2= new A();
		
	// Note:= i) If thread isAlive then it will return true otherwise false
	//	     ii) If we use isAlive method before the start method then it will print false but after the start method it will print true
		
		System.out.println(t1.isAlive());   // false
		t1.start();
		System.out.println(t1.isAlive());   // true
		
		System.out.println(t2.isAlive());   // false
		t2.start();
		System.out.println(t2.isAlive());   // true

	}

}
