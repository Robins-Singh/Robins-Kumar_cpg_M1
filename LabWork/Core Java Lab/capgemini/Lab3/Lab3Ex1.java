package com.capgemini.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Ex1{
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size :");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements :");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("2nd Smallest no is "+getSecondSmallest(arr));

	}

	private static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

}