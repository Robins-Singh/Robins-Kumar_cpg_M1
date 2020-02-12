package com.capgemini.Lab7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;


public class Lab7Ex1 {

	public static void main(String[] args) {
		
		Map<String,Integer> m = new HashMap<>();
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			String str=s.next();
			m.put(str, str.length());
		}
		getValues(m);
	}

	private static void getValues(Map<String, Integer> m) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		Iterator<Integer> itr = m.values().iterator();
		while(itr.hasNext())
		{
			ts.add(itr.next());
		}
		System.out.println(ts);
	}

}
