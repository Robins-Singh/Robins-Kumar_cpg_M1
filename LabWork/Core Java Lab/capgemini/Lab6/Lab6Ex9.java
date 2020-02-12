package com.capgemini.Lab6;

public class Lab6Ex9{

	public static void main(String[] args) {
		
		int mons[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int d1=20,d2=15,m1=8,m2=1,y1=2010,y2=2020;
		int dd=0,dm=0,dy=0;
		if(y2%4==0)
			mons[1]=29;
		if(d2>d1 && m2>m1)
		{
			dd=d2-d1;
			dm=m2-m1;
			dy=y2-y1;
		}
		else if(d2>d1 && m2<m1)
		{
			dd=d2-d1;
			dm=m2-m1+12;
			dy=y2-(y1+1);
		}
		else if(d2<d1 && m2<m1)
		{
			dd=d2-d1+mons[m2-1];
			dm=m2-m1+11;
			dy=y2-(y1+1);
		}
		else if(d2<d1 && m2>m1)
		{
			dd=d2-d1+mons[m2-1];
			dm=m2-m1;
			dy=y2-y1;
		}
		System.out.println(dd+" Days "+dm+" Months "+dy+" Years ");
	}

}
