package com.capgemini.Lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab7Ex6 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> m = new HashMap<>();
		m.put(101, 32);
		m.put(102, 54);
		m.put(103, 7);
		m.put(104, 12);
		m.put(105, 43);
		m.put(106, 22);
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		for(int i : votersList(m))
			System.out.print(i+" ");
	}

	private static ArrayList<Integer> votersList(HashMap<Integer, Integer> m) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Iterator<Map.Entry<Integer, Integer>> entries = m.entrySet().iterator();
		while(entries.hasNext()){
			Map.Entry<Integer, Integer> e = entries.next();
			if(e.getValue()>=18)
				list.add(e.getKey());
		}
		return list;
	}

}
