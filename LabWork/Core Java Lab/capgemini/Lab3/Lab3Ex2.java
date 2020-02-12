package com.capgemini.Lab3;

import java.util.Scanner;

public class Lab3Ex2{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size :");
		int n=s.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter array elements :");
		for(int i=0,x=0;i<n;i++,x++)
		{
			arr[i]=s.next();
			if(x<=(n/2))
			{
				arr[i]=arr[i].toLowerCase();
			}
			else
			{
				arr[i]=arr[i].toUpperCase();
			}
		}
		
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" ");
	}
}