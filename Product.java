package com;

import java.util.Scanner;

public class Product implements Cloneable  // marker interface cloneable
{
	int pid;
	String pname;
	double pcost;
	
	//product class constructor ( parameterized constructor)
	public Product(int pid, String pname, double pcost)  // pass parameter
	{
		this.pid=pid;       // this. keyword use for current value intialized
		this.pname=pname;
		this.pcost=pcost;
	}
	//method that prints the detail on the console 
	
	public void showDetail()               // method shoDetail	thid define pid, pname,pcost
	{
		System.out.println("product Id:" +pid);
		System.out.println("product Name:" +pname);
		System.out.println("product Cost:" +pcost);	
	}
// main method entry point of any programm
	public static void main(String[] args) throws CloneNotSupportedException
	{
		// reading value of the product from the user
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the product ID:");
		int pid = sc.nextInt();
		System.out.print("Enter the product name:");
		String pname = sc.next();
		System.out.print("Enter the product cost:");
		double pcost = sc.nextDouble();
		System.out.println("-------------product details------------");
		Product p1 = new Product (pid,pname,pcost);   // object name product p1  and pass the value pid,pname,pcost
		
		// cloning the object of the product class using clone() method
		
         Product p2 = (Product)p1.clone();
         
         // invoking the method tp print details
         
         p2.showDetail();
        
	}

}
