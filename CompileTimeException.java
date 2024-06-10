package com;
import java.io.FileInputStream;

public class CompileTimeException {

	public static void main(String[] args) {
		//File TnputStream fis new FileInputStream ("d:/abc.txt");
	/*
		try
		{
			int a= 100, b=0,c;
			c = a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e)  // exception
		{
			System.out.println(e);
		}
		System.out.println("You cannot divide by zero");
	*/
		
		try
		{
			FileInputStream fis = new FileInputStream ("d: /abc.txt");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hello Exception handling");
	}

}
