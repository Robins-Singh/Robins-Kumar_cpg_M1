package com.capgemini.Lab10;

@FunctionalInterface
interface authentication{
	boolean check(String username,String password);
}
public class Lab10Ex3 {

	public static void main(String[] args) {
		authentication a = (username,password) -> {
			if(username==null || password==null)
				return false;
			else
				return true;
		};
		if(a.check("punit", "punit12")){
			System.out.println("Authentication Successfull");
		}
		else
			System.out.println("Authentication failed");
		
		System.out.println("-----------");
		
		if(a.check("punit", "")){
			System.out.println("Authentication Successfull");
		}
		else
			System.out.println("Authentication failed");
		
		System.out.println("----------");
		
		if(a.check("punit", null)){
			System.out.println("Authentication Successfull");
		}
		else
			System.out.println("Authentication failed");
	}

}
