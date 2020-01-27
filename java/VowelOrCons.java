package com.java.project;

import java.util.Scanner;

public class VowelOrCons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("enter a charcter : ");
		 char c = sc.next().charAt(0); 
		 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			 System.out.println("vowel");
		 else
			 System.out.println("consonant");
	}

}
