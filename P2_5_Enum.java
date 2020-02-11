package com.capgemini.basics.demo;

public class P2_5_Enum {
	String firstName;
	String lastName;
	char gender;
	int age;
	double wei;
	int phone;
	public String toString() {
		return "P2_5_Enum [age=" + age + ", firstName=" + firstName
				+ ", gender=" + gender + ", lastName=" + lastName + ", phone="
				+ phone + ", wei=" + wei + "]";
	}
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public P2_5_Enum(String firstName, String lastName, char gender, int age,
			double wei, int phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.wei = wei;
		this.phone = phone;
	}
	public P2_5_Enum() {
		super();
	}
	public void display() {
		firstName="Clay";
		lastName="Johnson";
		gender='M';
		age=23;
		wei=59.30;
		System.out.println("\nFirst Name:"+firstName+"\nLast Name: "+lastName+"\nGender: "+gender+"\nAge: "+age+"\nWeight: "+wei+"\nPhone Number: "+phone);
	}
}
