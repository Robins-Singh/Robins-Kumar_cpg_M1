package com.capgemini.Lab7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab7Ex3 {

	public static void main(String[] args) {
		int arr[]={9,4,6,1,5};
		getSquares(arr);
	}

	private static void getSquares(int[] arr) {
		
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			m.put(arr[i],arr[i]*arr[i]);
		}
		Iterator<Map.Entry<Integer, Integer>> entries = m.entrySet().iterator();
		while(entries.hasNext()){
			Map.Entry<Integer, Integer> e = entries.next();
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}

}
