package com.capgemini.Lab6;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.StringTokenizer;

public class Lab6Ex6{

	public static void main(String[] args) {
		try 
		{
			DataInputStream d = new DataInputStream(new FileInputStream("D:\\MyFile1.txt"));
			int charCount=0,wordsCount=0,linesCount=0;
			String line="";
			while((line=d.readLine())!=null)
			{
				StringTokenizer t= new StringTokenizer(line," ");
				wordsCount=wordsCount +t.countTokens();
				
				while(t.hasMoreTokens())
				{
					String word=t.nextToken();
					charCount=charCount+word.length();
				}
				++linesCount;
			}
			
			System.out.println("No of Lines = "+linesCount);
			System.out.println("No of Words = "+wordsCount);
			System.out.println("No of Characters = "+charCount);
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
