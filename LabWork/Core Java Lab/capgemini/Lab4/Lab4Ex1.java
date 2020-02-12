package com.capgemini.Lab4;

import java.util.Scanner;

public class Lab4Ex1 {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		while(n>0){
			int i=n%10;
			sum+=i*i*i;
			n/=10;
		}
		System.out.println("Sum of cubes of digits = "+sum);
	}

}
