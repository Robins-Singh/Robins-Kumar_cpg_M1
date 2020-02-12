package com.capgemini.Lab6;

import java.awt.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab6Ex4{

	public static void main(String[] args) {
		Set<Character> se = new HashSet<Character>();
		se.add('a');
		se.add('e');
		se.add('i');
		se.add('o');
		se.add('u');
		Scanner s= new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = s.next();
		char [] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(!se.contains(arr[i])){
				int temp = (int)arr[i]+1;
				arr[i]=(char)temp;
			}
		}
		for(char ch: arr)
			System.out.print(ch+" ");

	}

}
