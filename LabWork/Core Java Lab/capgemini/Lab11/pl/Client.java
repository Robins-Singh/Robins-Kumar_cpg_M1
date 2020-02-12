package com.capgemini.Lab11.pl;

import com.capgemini.Lab11.bean.Employee;
import com.capgemini.Lab11.service.EmployeeImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeImpl emp = new EmployeeImpl();
		emp.addEmployee(new Employee(1, "punit", 20000, "Programmer"));
		emp.addEmployee(new Employee(2, "raj", 11000, "System Associate"));
		emp.addEmployee(new Employee(3, "sachin", 3000, "Clerk"));
		emp.addEmployee(new Employee(4, "mayank", 24000, "Manager"));
		emp.findInsuranceScheme(1);
	}

}
