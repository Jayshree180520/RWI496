package com;

//MORE EXAMPlE


class Person {
String name;
long id;
Person(String name, long id) {
this.name = name;
this.id = id;
}
}
class Passport extends Person {
String personName;
Passport(String name, long id) {
super(name, id);
this.personName = name;
}
}
public class AssociationEx {
public static void main(String args[]) {
Passport obj = new Passport("Jayshree", 99884444);
System.out.println(obj.personName + " is a person with a passport number: " + obj.id);
}
}



