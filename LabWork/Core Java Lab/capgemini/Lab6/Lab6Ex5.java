package com.capgemini.Lab6;

import java.util.Scanner;

public class Lab6Ex5{

	public static void main(String[] args) {
		System.out.println("Enter number : ");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		
		System.out.println(modifyNumber(n));

	}

	private static int modifyNumber(int n) {
		String str=Integer.toString(n);
		String res = "";
		for(int i=0;i<str.length()-1;i++)
		{
			int a=Integer.parseInt(str.charAt(i) + "");    //parseInt convert string to integer, not char to int that's why "" is added
			int b=Integer.parseInt(str.charAt(i+1) + "");
			res+=Math.abs(a-b);
		}
		res+=str.charAt(str.length()-1);
		return Integer.parseInt(res);
	}

}
