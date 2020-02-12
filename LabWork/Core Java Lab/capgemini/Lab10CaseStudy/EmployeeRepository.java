package com.capgemini.Lab10CaseStudy;
import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeRepository {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "Punit", "Raj", "punit@gmail.com", "9430652927", LocalDate.now(), "Senior Analyst", 10000, 103,new Department(1, "Technical", 105)));
		emp.add(new Employee(102, "Mayank", "Raj", "mayank@gmail.com", "8480654975", LocalDate.of(2017, 12, 2), "Sales Executive", 5000, 104,new Department(2, "Sales", 104)));
		emp.add(new Employee(103, "Nitish", "Kumar", "nitish@gmail.com", "9472654954", LocalDate.of(2018, 4, 24), "Analyst", 15000, 103,new Department(1, "Technical", 105)));
		emp.add(new Employee(103, "Chandra", "Prakash", "prakash@gmail.com", "9474851654", LocalDate.of(2020, 7, 6), "Analyst", 15000, 104,null));
		emp.add(new Employee(103, "Jatin", "Madaan", "jatin@gmail.com", "87864325642", LocalDate.of(2012, 3, 16), "Sales Executive", 25000, 103,null));
		EmployeeService.addSalary(emp);
		EmployeeService.departmentWithEmpCount(emp);
		EmployeeService.departmentWithHighestEmp();
		EmployeeService.employeesWithoutDept(emp);
		EmployeeService.DepartmenWithoutEmp();
	}

}
