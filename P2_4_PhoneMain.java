package com.capgemini.basics.demo;

import java.util.Scanner;

public class P2_4_PhoneMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		P2_4_Phone p1 = new P2_4_Phone();
		System.out.println("Enter phone number: ");
		String ph = sc.next();
		p1.display();
		System.out.println("Phone Number: "+ph);
	}
}
