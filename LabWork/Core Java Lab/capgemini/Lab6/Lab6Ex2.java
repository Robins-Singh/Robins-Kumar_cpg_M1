package com.capgemini.Lab6;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Lab6Ex2{

	public static void main(String[] args) {
		try {
			DataInputStream d = new DataInputStream(new FileInputStream("D:\\MyFile1.txt"));
			String line="";
			int count=0;
			while((line=d.readLine())!=null)
			{
				System.out.println("Line "+(++count)+" : "+line);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
