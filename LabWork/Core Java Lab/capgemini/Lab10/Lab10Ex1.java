package com.capgemini.Lab10;

@FunctionalInterface
interface Power{
	int pow(int x,int y);
}
public class Lab10Ex1 {

	public static void main(String[] args) {
		
		Power p = (x,y)->{return (int) Math.pow(x, y);};
		System.out.println("Power Value = "+p.pow(2,3));

	}

}
