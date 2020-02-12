package com.capgemini.Lab11.service;

import com.capgemini.Lab11.bean.Employee;

public interface EmployeeInsuarance {
	public boolean addEmployee(Employee empl);
	public void findInsuranceScheme(int id);
	public void displayDetails(int id);
}
