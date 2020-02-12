package com.capgemini.Lab6;

import java.io.File;
import java.util.Scanner;

public class Lab6Ex7{

	public static void main(String[] args) {
		System.out.println("Enter file name : ");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		File f = new File(name);
		if(f.exists())System.out.println("File Exists");
		if(f.canRead())System.out.println("File is Readable");
		if(f.canWrite())System.out.println("File is Writable");
		if(f.isHidden())
			System.out.println("Hidden file");
		else
			System.out.println("Not Hidden");
		System.out.println("Length of file is "+f.length());
	}

}
