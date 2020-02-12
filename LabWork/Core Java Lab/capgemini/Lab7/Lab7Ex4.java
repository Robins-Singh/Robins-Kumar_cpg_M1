package com.capgemini.Lab7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab7Ex4 {

	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("Punit", 94);
		m.put("Mayank", 78);
		m.put("Nitish", 86);
		m.put("Vinay", 82);
		m.put("cp", 56);
		getStudents(m);
	}

	private static void getStudents(HashMap<String, Integer> m) {
		HashMap<String, String> m1 = new HashMap<>();
		
		Iterator<Map.Entry<String, Integer>> entries = m.entrySet().iterator();
		while(entries.hasNext()){
			Map.Entry<String, Integer> e = entries.next();
			int value=e.getValue();
			if(value>=90)
				m1.put(e.getKey(),"Gold");
			else if(value>=80 && value<90)
				m1.put(e.getKey(), "Silver");
			else if(value>=70 && value<80)
				m1.put(e.getKey(), "Bronze");
			else
				m1.put(e.getKey(), "NA");
		}
		System.out.println(m1);
		
	}

}
