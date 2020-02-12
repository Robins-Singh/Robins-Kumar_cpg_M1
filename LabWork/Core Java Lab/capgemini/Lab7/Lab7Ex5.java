package com.capgemini.Lab7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Lab7Ex5 {

	public static void main(String[] args) {
		int arr[]={45,65,76,13,87};
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
			a.add(arr[i]);
		Collections.sort(a);
		System.out.println(a.get(a.size()-2));
		}
	}
