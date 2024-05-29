package com;

// Inheritance is the process where a class acquires the attributes and method of another class. 
// In java extends keyword is used to perform inheritance.
// It provide code reusability
// Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors 
// of a parent object. It is an important part of OOPs (Object Oriented programming system).

// There are four type of Inheritance:-
// i) Single inheritance
// ii) multiple inheritance
// iii) Multi level inheritance
// iv) Hierachieal inheritance

// i) Single inheritance
// ==> In this case only one super class and only one sub class
/*
class student{
	int roll, marks;
	String name;
    void input()
	{
		System.out.println(" Enter roll name & marks: ");
	}
	class ankit extends student
	{
		void disp()
		{
			roll= 1; name = "ankit"; marks =89;
			System.out.println(roll + "" + name + "" + marks);
		}
		class Inheritance{
		public static void main(String[] args) {
			ankit r = new ankit();
			r.input(); r.disp();
		}
	}
	}
}
*/
          //      ii) Multi level inheritance
/*

class A // super class
{
	int a,b,c;
	void add()
	{
		a = 10; b= 20;
		c= a+b;
		System.out.println("Sum of two number:" + c);
	}
	void sub()
	{
		a = 200; b = 100;
		c = a-b;
		System.out.println("sub of two number:" +c);
	}
}
class B extend A // sub class
{
	void multi ()
	{
		a = 10; b = 20;
		c = a*b;
		System.out.println("Multiplication of two number :" + c);
	}
	void div()
	{
		a = 10; b = 2;
		c = a/b;
		System.out.println("Division of two number :" +c);
	}
}
class c extends B // subclass
{
	void rem()
	{
		a = 10; b =3;
		c = a%b;
		System.out.println("Remainder of two number:" + c);
	}
}
class inheritance 
{
	public static void main (String [] args) {
		c r= new c();
		r.add(); r.sub(); r.multi(); r.div(); r.rem();
	}
}
*/

//           iii) Hierarchial inheritance 
//==> A inheritance which contain only one super class and multiple 
// sub class and all sub class directly extends super class and all sub class directly extends super class.

class A{
	void input()
	{
		System.out.println("Enter your name:");
	}
}
class B extends A
{
	void show ()
	{
		System.out.println("My name is Ankit");
	}
}
class C extends A
{
	void Disp () 
	{
		System.out.println("My name is Ankush");
	}
}
class Inheritance
{
	public static void main(String [] args) {
		B r= new B();
		C r2= new C();
		r.input(); r.show();
		r2.input(); r2.Disp();
		
	}
}



