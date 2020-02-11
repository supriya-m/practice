package com.capgemini.basics.demo;

import java.util.Scanner;

public class P2_5_EnumMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		P2_5_Enum obj = new P2_5_Enum();
		System.out.println("Enter phone number: ");
		String ph = sc.next();
		obj.display();
		System.out.println("Phone Number: "+ph);
		
	}

	
}
