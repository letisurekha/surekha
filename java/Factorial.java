package com.java.project;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("enter a numbers : ");
		 int n=sc.nextInt();
		 int f=1;
		 for(int i=1;i<=n;i++) {
			 f=f*i;
		 }
		 System.out.print("The factorial of"+n+"is : "+f);
	}

}
