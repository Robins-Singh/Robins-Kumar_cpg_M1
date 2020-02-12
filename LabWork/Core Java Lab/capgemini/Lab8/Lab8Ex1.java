package com.capgemini.Lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class CopyDataThread extends Thread{
	public void run(){
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
	}
}
public class Lab8Ex1 {

	public static void main(String[] args) {
		new CopyDataThread().start();
	}

}
