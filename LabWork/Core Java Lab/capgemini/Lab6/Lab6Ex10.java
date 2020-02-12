package com.capgemini.Lab6;

import java.util.Scanner;

public class Lab6Ex10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=s.next();
		int i=str.indexOf("_job");
		if(i==-1){
			System.out.println("false");
		}
		else{
			String substr=str.substring(0,i);
			if(substr.length()!=8){
				System.out.println("false");
			}
			else
				System.out.println("true");
		}
	}

}
