package com.pranik.java;
import java.util.Scanner;

public class InputClass 
{
	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your First Number: ");
		int firstNumber = scan.nextInt();
		
		System.out.println("Enter Your Second Number: ");
		int secondNumber = scan.nextInt();
		
		int sum =firstNumber+secondNumber;
		System.out.println("The Sum is :"+ sum);
	}
}
