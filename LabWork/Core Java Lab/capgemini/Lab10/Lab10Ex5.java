package com.capgemini.Lab10;

@FunctionalInterface
interface fact{
	
	int factorial(int n);
}
public class Lab10Ex5 {

	static int factorial(int n){
		int f=1;
		for(int i=2;i<=n;i++){
			f=f*i;
		}
		return f;
	}
	public static void main(String[] args) {
		
		fact f = Lab10Ex5::factorial;  //method reference
		
		System.out.println("Factorial of 5 = "+f.factorial(5));
		System.out.println("Factorial of 9 = "+f.factorial(6));
		
	}

}
