package com;

class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("My child class");
			
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args)  {
		B r= new B();
		
		Thread t=new Thread(r);
		t.run();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("My main Thread");
			
		}

	}

}


/*
class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("My child class");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args) throws InterruptedException {
		B r= new B();
		
		Thread t=new Thread(r);
		t.run();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("My main Thread");
			Thread.sleep(1000);
		}

	}

}
*/