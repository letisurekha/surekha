package com.java.project;

import java.util.Scanner;

public class PositiveOrNegitive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("enter the numbers : ");
		 int n=sc.nextInt();
		 if(n>0)
			 System.out.print("positive");
		 else	 
			 System.out.print("negative");

	}

}
