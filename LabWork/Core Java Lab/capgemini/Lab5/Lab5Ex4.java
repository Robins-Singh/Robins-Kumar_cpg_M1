package com.capgemini.Lab5;

import java.util.Scanner;

import com.raj.excep.MyException;

public class Lab5Ex4{

	public static void main(String[] args) throws MyException{

		try{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter first name : ");
			String fname = s.nextLine();
			System.out.println("Enter last name : ");
			String lname = s.nextLine();
			if(fname.equals("")||lname.equals(""))
			{
				throw new MyException();
			}
			else
			{
				System.out.println("Valid Full Name");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
