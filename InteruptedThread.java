package com;

// interrupt:- it is a method of thread class that is used to interrupt the thread.

class D extends Thread
{
	public void run()
	{
		try 
		{
			for(int i=1; i<=5; i++);
			{
				System.out.println("t1 thread running");
				Thread.sleep(1000); // waiting 
			}
		}
		catch (InterruptedException i)
		{
			System.out.println("t1 thread threading");
		}
	}
}
public class InteruptedThread {

	public static void main(String[] args) {
		
		D t1 = new D();
		
		t1.start();
		
		t1.interrupt();	
	}

}
