package com.capgemini.Lab3;

import java.util.HashMap;
import java.util.Scanner;

public class Lab3Ex4{

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=s.next();
		char[] ch = str.toCharArray();
		
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();   // Wrapper class is used
		for(int i=0;i<ch.length;i++)
		{
			if(m.containsKey(ch[i])){
				m.put(ch[i], m.get(ch[i])+1);
			}
			else
				m.put(ch[i], 1);
		}
		System.out.println(m);   //HashMap is not sorted order, TreeMap is in sorted
	}

}