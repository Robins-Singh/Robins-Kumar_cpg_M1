package com.capgemini.Lab1;

import java.util.Scanner;

public class Lab1Ex1{
	
	public static int sumofn(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
				sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no : ");
		int n=s.nextInt();
		
		System.out.println("Sum = "+sumofn(n));
	}

}
