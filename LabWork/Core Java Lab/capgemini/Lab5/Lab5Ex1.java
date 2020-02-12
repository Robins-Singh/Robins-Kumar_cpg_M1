package com.capgemini.Lab5;

import java.util.Scanner;

public class Lab5Ex1{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter choice : ");
		String choice=s.next();
		switch (choice) {
		case "red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Wait");
			break;
		case "green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}