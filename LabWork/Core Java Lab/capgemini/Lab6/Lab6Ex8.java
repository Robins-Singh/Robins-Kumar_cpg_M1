package com.capgemini.Lab6;

import java.util.Scanner;

public class Lab6Ex8 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=s.next();
		boolean flag = true;
		for(int i=0;i<str.length()-1;i++){
			if((int)str.charAt(i)>(int)str.charAt(i+1)){
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Positive String");
		else
			System.out.println("Normal string");
	}

}
