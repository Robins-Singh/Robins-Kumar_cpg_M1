package com.capgemini.Lab7;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Lab7Ex8 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts= new TreeSet<>();
		int arr[]={1,2,3,4,5,2,3,4,7,6,7,6,8};
		for(int i=0;i<arr.length;i++){
			ts.add(arr[i]);
		}
		
		Iterator<Integer> itr = ts.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}

}
