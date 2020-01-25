package com.ex.java;

import java.util.Scanner;

public class RemainderQ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the dividend  numbers : ");
		int n1=sc.nextInt();
		System.out.print("enter the divisor  numbers : ");
		int n2=sc.nextInt();
		System.out.println("the Quotient is : "+(n1/n2));
		System.out.println("the Remainder is : "+(n1%n2));


	}

}
