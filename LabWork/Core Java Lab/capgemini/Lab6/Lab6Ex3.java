package com.capgemini.Lab6;
import java.util.Scanner;
public class Lab6Ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=s.next();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(str+"|"+sb.reverse().toString());
	}

}
