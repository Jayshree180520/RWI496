package com;

class x extends Thread
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

public class ThreadSchedular {

	public static void main(String[] args) {
	x t1= new x();
	x t2= new x();
	x t3= new x();
	
	t1.setName("thread 1");
	t2.setName("thread 2");
	t3.setName("thread 3");
	
	t1.start();
	t2.start();
	t3.start();
	
	String n = Thread.currentThread().getName();
	for (int i=1; i<=3; i++)
	{
		System.out.println(n);
	}

	}

}
