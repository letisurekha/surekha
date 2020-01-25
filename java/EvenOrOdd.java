package com.ex.java;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number : ");
		int n=sc.nextInt();
		
		String status = (n%2==0) ? "Even":"Odd";
		System.out.print(status);
		
		// (n>0 )? 30 : 60;

	}

}
