package com;

public class TryCatchFinally {

	public static void main(String[] args) {
		try
		{
			int a = 100,b=2,c;
			int a1 = 100,b1=0,c1;
			c = a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("I am in finally block");
		}

	}

}
