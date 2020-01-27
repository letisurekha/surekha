package com.java.project;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("enter the year numbers : ");
		 int n=sc.nextInt();
		 if((n%4==0)&&(n%100!=0)) 
			 System.out.println("Leaf year");
		 else
			 System.out.println("not a leaf year");

	}

}
