package com.java.project;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("enter the value to generate fibnocci series : ");
		 int n=sc.nextInt();
		 int a=0,b=1;
		 System.out.print(a+" ");
		 System.out.print(b);
		 for(int i=0;i<n;i++) {
			 int c=a+b;
			 a=b;
			 b=c;
			 System.out.print(" "+c);
		 }

	}

}
