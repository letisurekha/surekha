package com.java.project;

import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("enter a numbers : ");
		 int n=sc.nextInt();
		 int sum=0;
		 for(int i=1;i<=n;i++) {
			 sum=sum+i;
		 }
		 System.out.println("Sum of natural numbers is : "+sum);
	}

}
