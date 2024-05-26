package com.company;

public class IntroductionOfJava {
    /*
 1. What is Java?
    => Java is a platform independent and multi-paradigm programming language.
   === Note: Multi-Paradigm means it supports multiple styles of programming
   Java supports
	  1. Object-Oriented programming [From beginning version 1.0]
	  2. Functional programming      [From Java 8v]
	  3. Modular programming	 [From Java 9v]
	  4. Data-Oriented programming	 [From Java 17v]
	  5. Procedural programming      [From Java 22v]
In future versions it may also support scripting style programing
    - For proof visit the website
	  openjdk.org -> scroll down -> click on 21 -> click on 445 link
	  -> scroll down you can find a statement "Java is multi-paradigm language"
Java Installation:-
  Go to google and type "Install JDK" Install java jDK
  Go to google and type " Install intellij idea" install Java IDE
  JDK = It is a Java development kit = collection of tools used for developing and running Java Programs.
  JRE = It is Java RunTime Environment = helps in executing program develop in Java.

 2. Who invented Java?
 Java is invented by Mr. James Gosling in SUN Microsystems in the year 1991.
      i) It is released in the year 1995. The version is released only for testing purpose.
      ii) The first version for project development is released in the year 1996 as Java 1.0.
     iii) The latest version of Java is 22 it is released on Mar 19th 2024.
     iv)Currently Java is with Oracle Corporation. In the year 2010 (the version number Java 7)
     v) Oracle Corporation acquired Java and all other products of SUN Microsystems.

 3. Why Java is invented?
       Java is invented to achieve platform independent for developing internet based business applications

 4. Types of applications- SA and IA?
      In the computer world all software or project or applications are basically divided into two types
          i) Stand-alone applications
	     ii) Internet applications
  i) Stand-alone application
       => An application that is installed in one system and if it is accessible only within this system with a local
        call, and can not be accessibile from other systems with a network via internet then we call it as
        stand-alone application.
 - A stand-alone application is a single user and single computer application.
- For example:
	 	Calc, Notepad, Antivirus, MS-Office, game software, browser, mobile apps, ...
  ii) Internet application
         => An application that is installed in one system and if it is accessible from other systems
	   with a network via internet is called as internet application.
    An internet application is a Multi user and multi computer application.
- For example:
	 	YouTube, instagram, facebook, amazon, zoom software, etc...
	Conclusion:
	  -> Any software you install in your system and use it, it is a stand-alone application
 -> Any software you access it via browser and use it without installing in your system, then it is internet application

5. What is platform, Platform dependent, platform independent?
    Platform == A platform is the hardware or software environment in which a program runs. We've already mentioned
      some of the most popular platforms like Microsoft Windows, Linux, Solaris OS, and Mac OS.
    Platform dependent == the Java Virtual Machine is referred to as platform-dependent because it differs for
    each platform.
    Platform independent == Java is platform-independent because it is compiled to a bytecode that can be run on
    any device that has a Java Virtual Machine (JVM). This means that you can write a Java program on one
    platform (such as Windows) and then run it on a different platform (such as macOS or Linux) without making
     any changes to the code.

6. Why C and C++ languages are PD?
      C = These programming languages help debug because we can easily isolate the error-containing procedure.
      c++ = The goal of this class is that each student will be able to solve problems in C++ and have a solid
       foundation in software development methodology.

7. How Java achieved PI?
   String piSymbol = "\u03C0"; // This code represents the pi symbol System. out. println
   ("The value of pi is: " + piSymbol); Use code with caution.
      import java. lang. Math. *;
      public class Pie {
      public static void main(String[] args) {
      //radius and length.
      double radius = 5;
      double len = 15;
     // calculate the area using PI.
     double area = radius * radius * Math. PI;

8. Import facts on Java program and Java software?
     Java program = To use import in Java, you use the import statement at the beginning of your file,
     for example import java. util. *; . This statement allows you to use classes and packages without having
     to write their full names every time you need them.
     Java software == IntelliJ IDEA is a top-tier Integrated Development Environment (IDE) designed specifically
     for Java developers. This fantastic tool, developed by JetBrains, offers a sleek and intuitive interface
     that significantly improves your coding experience.

9. Types of Java software [JDK and JRE]?
JDK(Java Development Kit) is used to develop Java applications. JDK also contains numerous development tools
like compilers, debuggers, etc.
JRE(Java Runtime Environment) is the implementation of JVM(Java Virtual Machine) and it is specially
 designed to execute Java

10. Why JRE is removed in Java 11v?
Auto-update, which was available for JRE installations on Windows and macOS, is no longer available.
In Windows and macOS, installing the JDK in previous releases optionally installed a JRE. In JDK 11,
this is no longer an option. In this release, the JRE or Server JRE is no longer offered.


** Naming Conventions:-
For Classes = we use Pascal convention First and Subsequent Characters from a word are capital letter (upercase)
   Ex- Main, MyScanner, MyEmployee,
For Functions = for function and variables , we use CamelCaseConvention here first character is Lowercase and the
 subsequent character are uppercase like below:
  Ex- main, myScanner, MyMarks

  ** Variables:-
  It is a container that store a value. this value can be changed during the execution of the program
     Ex- int number = 8; ---> value it store
          (int) - data type
          (number)- variable name
    // Rules for declaring a variable name :-
    we can choose a name while declaring a java variable if the following rules are followed;
    i) Must not begin with a digit --> int 1Harry is invalid
    ii) Name is Case sensitive ----> harry and Harry are differnet
    iii) should not be a keyword ( like void )
    iv) white space not allowed ----> int code with Harry is invalid
    v) can contain alphabeted and character, - character and digits if the other condition are met

     */



}
