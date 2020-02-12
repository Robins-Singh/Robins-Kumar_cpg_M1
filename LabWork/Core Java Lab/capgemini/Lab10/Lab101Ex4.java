package com.capgemini.Lab10;

interface emp{
	Employee print(int empid,String name);
}

class Employee{
	private int empid;
	private String name;
	
	public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
		System.out.println(empid+" "+name);
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Lab101Ex4 {

	public static void main(String[] args) {
		emp e = Employee::new;
		e.print(1, "Punit");
	}

}
