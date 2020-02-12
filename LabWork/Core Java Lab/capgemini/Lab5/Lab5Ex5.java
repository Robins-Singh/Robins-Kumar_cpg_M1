package com.capgemini.Lab5;

import java.util.Scanner;

import labwork.AgeValidationException;

public class Lab5Ex5{
	 
	public static void main(String[] args) throws AgeValidationException{
		System.out.println("Enter your age : ");
		Scanner s = new Scanner(System.in);
		int age=s.nextInt();
		try{
			if(age<18)
				throw new AgeValidationException();
			else
				System.out.println("Valid Age");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
