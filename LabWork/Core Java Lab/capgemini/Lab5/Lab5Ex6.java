package com.capgemini.Lab5;

import java.util.Scanner;

class EmployeeSalaryException extends Exception{
	EmployeeSalaryException(){
		super();
	}
}
public class Lab5Ex6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter salary : ");
		int salary = s.nextInt();
		try{
			if(salary<3000){
				throw new EmployeeSalaryException();
			}
			else{
				System.out.println("Salary is good");
			}
		}
		catch(Exception e){
			System.out.println("Salary is Less");
		}
	}
}
