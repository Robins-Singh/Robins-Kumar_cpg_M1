package com.capgemini.Lab7;

import java.util.Arrays;
import java.util.Scanner;

public class Lab7Ex7 {

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
		getSorted(arr);
		Arrays.sort(arr);
		for(int x:arr){
			System.out.println(x+" ");
		}
	}
	public static void getSorted(int []arr){
		for(int i=0;i<arr.length;i++){
			StringBuffer sb=new StringBuffer(Integer.toString(arr[i]));
			String str=sb.reverse().toString();
			arr[i]=Integer.parseInt(str);
		}
	}
}
