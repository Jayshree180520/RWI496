package com;

// Stop Thread method:- it is a method of thread class which is used to terminate a thread permanantely
class a1 extends Thread
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

public class StopThreadMethod  {

	public static void main(String[] args) {
	a1 t1= new a1();
	a1 t2= new a1();
	a1 t3= new a1();
	
	t1.setName("thread 1");
	t2.setName("thread 2");
	t3.setName("thread 3");
	
	
	t1.start();
	
	t2.start();
	
	t3.start();
	
	t3.stop();
		

	}

}
