package com.capgemini.basics.demo;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setFirstName("Adam");
		p1.setLastName("Johnson");
		p1.setGender('M');
		p1.setAge(20);
		p1.setWei(61.67);
		System.out.println(p1);
		
	}
}
