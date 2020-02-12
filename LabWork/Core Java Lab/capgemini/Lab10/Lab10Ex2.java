package com.capgemini.Lab10;

@FunctionalInterface
interface insertspace{
	String insertSpace(String s);
}
public class Lab10Ex2 {

	public static void main(String[] args) {
		insertspace is = (s) -> {
			String str="";
			for(int i=0;i<s.length()-1;i++){
				str=str+s.charAt(i)+" ";
			}
			str+=s.charAt(s.length()-1);
			
			return str;
		};
		System.out.println("New String is : "+is.insertSpace("raj"));
	}

}
