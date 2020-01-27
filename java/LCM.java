package com.java.project;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("enter the two numbers : ");
		 int n1=sc.nextInt();
		 int n2=sc.nextInt();
		 int s1=1,s2=1;
		 for(int i=1;i<n1||i<n2;i++) {
			 if(n1%i==0) 
				 s1=s1*i;
			 if(n2%i==0)
				 s2=s2*i;
		 }
		 System.out.print("LCM of "+n1+" and "+n2+" is : "+(s1*s2));
	}

}
