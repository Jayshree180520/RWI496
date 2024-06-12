package com;

class y implements Runnable
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

public class SleepMethod {

	public static void main(String[] args) throws InterruptedException {
		y r= new y();
		
		Thread t=new Thread(r);
		t.run();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("My main Thread");
			Thread.sleep(1000);
		}

	}

}

		

	


