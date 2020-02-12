package com.capgemini.Lab11.service;

import com.capgemini.Lab11.bean.Employee;
import com.capgemini.Lab11.dao.EmployeeDaoImpl;

public class EmployeeImpl implements EmployeeInsuarance {
	EmployeeDaoImpl dao;
	public  EmployeeImpl() {
		dao = new EmployeeDaoImpl();
	}
	@Override
	public boolean addEmployee(Employee empl) {
		
		return dao.addEmployee(empl);
	}

	@Override
	public void findInsuranceScheme(int id) {
		// TODO Auto-generated method stub
		Employee emp = dao.getEmployeeById(id);
		int salary = emp.getSalary();
		String designation = emp.getDesignation();
		if(salary >= 40000 && designation.equals("Manager")) {
			System.out.println("Scaheme A");
			emp.setInsuranceScheme("Scaheme A");
			dao.addEmployee(emp);
		}
		else if(salary >= 20000 && salary < 40000 && designation.equals("Programmer")) {
			System.out.println("Scaheme B");
			emp.setInsuranceScheme("Scaheme B");
			dao.addEmployee(emp);
		}
		else if(salary >= 5000 && salary < 20000 && designation.equals("System Associate")) {
			System.out.println("Scaheme C");
			emp.setInsuranceScheme("Scaheme C");
			dao.addEmployee(emp);
		}
		else if(salary < 5000 && designation.equals("Clerk")) {
			System.out.println("No Scaheme ");
			emp.setInsuranceScheme("No Scaheme");
			dao.addEmployee(emp);
		}
	}

	@Override
	public void displayDetails(int id) {
		// TODO Auto-generated method stub
		Employee e =  dao.getEmployeeById(id);
		System.out.println(e);
	}
}
