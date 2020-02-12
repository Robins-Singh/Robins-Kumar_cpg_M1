package com.capgemini.Lab5;
import java.util.Scanner;

public class Lab5Ex2{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num : ");
		int n=s.nextInt();
		printFibNonRec(n);
		for(int i=0;i<n;i++)
		{
			System.out.print(printFibRec(i)+" ");
		}
		
	}

	private static void printFibNonRec(int n) {
		System.out.println("--------Non rec-----------");
		int a=0,b=1;
		if(n==1)
			System.out.println(a);
		if(n==2)
			System.out.println(a+" "+b);
		for(int i=0;i<n;i++)
		{
			System.out.print(a+" ");
			int temp=a;
			a=b;
			b=temp+b;
		}
		System.out.println("\n---------rec-------------");
	}
	
	private static int printFibRec(int n) {
		
		
		if(n==0 || n==1)
			return n;
		else
		{
			return (printFibRec(n-1)+printFibRec(n-2));
		}
		
	}

}
