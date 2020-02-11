package com.capgemini.basics.demo;

public class Person {
	String firstName;
	String lastName;
	char gender;
	int age;
	double wei;
	
//	constructor:parameterised
public Person(String firstName, String lastName, char gender, int age,
		double wei) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.age = age;
	this.wei = wei;
}
//	constructor:default
	public Person() {
		super();
	}
//	Getter and Setter methods:
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWei() {
		return wei;
	}
	public void setWei(double wei) {
		this.wei = wei;
	}
//	toString method
	public String toString() {
		return "\nFirst Name: "+firstName+"\nLast Name: "+lastName+"\nGender: "+gender+"\nAge: "+age+"\nWeight: "+wei+"\n";
	}
	
	
}
