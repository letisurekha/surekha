package com.ex.java;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the First numbers : ");
		int n1=sc.nextInt();
		System.out.print("enter the second numbers : ");
		int n2=sc.nextInt();
		int c=n1;
	     n1=n2;
	     n2=c;
		System.out.println("the First number is : "+n1);
		System.out.println("the second number is : "+n2);

	}

}
