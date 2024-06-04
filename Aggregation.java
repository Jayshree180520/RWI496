package com;
class Address{
	String houseNo;
	String city;
	String state;
	String country;
	
	public Address(String houseNo, String city, String state, String country) {
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.country = country;
	}
}
class Employee{
	String name;
	
	Address address;
	
	public Employee(String name, Address address) {
		this.name = name;
		this.address =address;
		
	}
	
	public void displayDetails() {
		System.out.println(address.houseNo + address.city + address.state + address.country);
		System.out.println(" \n ");
	}
}

	

public class Aggregation{
	public static void main(String []args) {
		Address a1= new Address("HIG32", "Raipur","chhattisgarh", "India");
		Employee e1 = new Employee ("Jayshree",a1);
	     e1.displayDetails();
	
	}
	
}
