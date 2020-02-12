package com.capgemini.Lab6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab6Ex1{

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value : ");
		String str = s.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int sum=0;
		while(st.hasMoreTokens())
		{
			int temp=Integer.parseInt(st.nextToken());
			System.out.print(temp+" ");
			sum+=temp;
		}
		System.out.println("\n Sum = "+sum);
	}

}