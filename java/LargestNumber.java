package com.java.project;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("enter the three numbers : ");
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
		 int num3=sc.nextInt();
		 if(num1>num2&&num1>num3)
			 System.out.println("first number is largest");
		 else if(num2>num1&&num2>num3)
			 System.out.println("second number is largest");
		 else
			 System.out.println("Third number is largest");

	}

}
