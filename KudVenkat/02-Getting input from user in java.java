package com.pranik.java;
import java.util.Scanner;

public class InputClass 
{
	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String Name =scan.next();
		
		System.out.println("Enter Your Age: ");
		int age = scan.nextInt();
		
		System.out.println("Hello "+ Name+" Your age is "+age);
	}
}
