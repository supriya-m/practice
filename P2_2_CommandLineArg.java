package com.capgemini.basics.demo;

public class P2_2_CommandLineArg {
	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		System.out.println(args[3]);
//		System.out.println(args[4]);
//		Run>>run configurations>>arguments>>Pass the arguments		
		int num=Integer.parseInt(args[0]);
		if(num > 0){
			System.out.println(num+" is a Positive Number");
		} else {
			System.out.println(num+" is a Negative Number");
		}
//		System.out.println(num);
	}

}
