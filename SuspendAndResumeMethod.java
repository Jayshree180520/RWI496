package com;

// Suspend :- the main purpose of suspend method id to put the thread from running state to waiting state.
// resume:-  It is used to resume a suspended thread from waiting state to runnable state. 

class v extends Thread
{
	public void run()
	{
		String n = Thread.currentThread().getName();
		for (int i=1; i<=3; i++)
		{
			System.out.println(n);
		}
	}
}

public class SuspendAndResumeMethod  {

	public static void main(String[] args) {
	v t1= new v();
	v t2= new v();
	v t3= new v();
	
	t1.setName("Jaya");
	t2.setName("Kaju");
	t3.setName("Laddoo");
	
	
	t1.start();
	t3.start();
	
	t2.start();
	t2.suspend(); // pause (The method suspend() from the type Thread has been deprecated since
	              //   version 1.2 and marked for removal)
	
	
	
	t2.resume(); // restart (The method resume() from the type Thread has been deprecated since
	              // version 1.2 and marked for removal)


	}
}


















