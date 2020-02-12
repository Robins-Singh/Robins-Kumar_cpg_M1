package com.capgemini.Lab5;


import java.util.Scanner;

public class Lab5Ex3{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num : ");
		int n=s.nextInt();
		
		for(int i=2;i<=n;i++)
		{
			int num=i;
			boolean flag=true;
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
					flag=false;
			}
			if(flag)
				System.out.print(num+" ");
		}

	}

}