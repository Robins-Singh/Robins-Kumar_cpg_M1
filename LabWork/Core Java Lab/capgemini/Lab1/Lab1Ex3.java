package com.capgemini.Lab1;

import java.util.Scanner;

public class Lab1Ex3{
	
	public static boolean powerof2(int n)
	{
		double res=(Math.log(n)/Math.log(2));
		if(res==(double)(int)res)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no : ");
		int n=s.nextInt();
		if(powerof2(n))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}