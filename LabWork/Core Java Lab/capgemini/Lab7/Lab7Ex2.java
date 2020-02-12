package com.capgemini.Lab7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Lab7Ex2 {

	public static void main(String[] args) {
		
		char a[]="geeksforgeeks".toCharArray();
		counCharacter(a);
	}

	private static void counCharacter(char[] a) {
		// TODO Auto-generated method stub
		Map<Character, Integer> m = new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			if(m.containsKey(a[i])){
				m.put(a[i], m.get(a[i])+1);
			}
			else{
				m.put(a[i],1);
			}
		}
		System.out.println(m);
		Iterator<Map.Entry<Character, Integer>> me = m.entrySet().iterator();
		while(me.hasNext()){
			Map.Entry<Character, Integer> e = me.next();
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}

}
