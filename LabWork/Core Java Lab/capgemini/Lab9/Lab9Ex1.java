package com.capgemini.Lab9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab9Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = ()->{
			int count=0;
			String s = "";
			try {
				BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rajpu\\Desktop\\Capgemini\\source.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\rajpu\\Desktop\\Capgemini\\target.txt"));
				int i;
				while((i=br.read())!=-1 && count<10){
					bw.write((char)i);
					s=s+(char)i;
					count++;
				}
				System.out.println(s);
				bw.close();
				br.close();
			} 
			catch (Exception e) {
				System.out.println(e);
			} 	
		};
		
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.execute(r);
	}

}
