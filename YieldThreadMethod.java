package com;

// Yield thread method;- it is a method of thread class that allow us to run another thread which has same 
// priority by pause its  current thread.


class thread1 extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		for (int i=1; i<=3; i++)
		{
			System.out.println(name);
			Thread.yield();
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		for (int i=1; i<=3; i++)
		{
			System.out.println(name);
		}
	}
}

public class YieldThreadMethod   {

	public static void main(String[] args) {
		
	Thread t1 = new thread1();
	Thread t2 = new thread1();
	
	t1.start();
	
	t2.start();
	


	}
}






