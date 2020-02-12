package com.capgemini.Lab1;

import java.util.Scanner;
public class Lab1Ex2{
	
	public static int square(int n){return n*n;}
	public static int difference(int n){

		int s1=0,s2=0;
		for(int i=1;i<=n;i++)
		{
			s1=s1+square(i);
			s2=s2+i;
		}
		return (s1-s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no : ");
		int n=s.nextInt();
		
		
		System.out.println("Result = "+difference(n));
	}

}
