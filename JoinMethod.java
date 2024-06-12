package com;

class z extends Thread
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

public class JoinMethod  {

	public static void main(String[] args) {
	z t1= new z();
	z t2= new z();
	z t3= new z();
	
	t1.setName("thread 1");
	t2.setName("thread 2");
	t3.setName("thread 3");
	
	
	t3.start();
	try
	{
		t3.join();
	}
	catch(InterruptedException i)
	{
		
	}
	t2.start();
	t1.start();

	}

}
