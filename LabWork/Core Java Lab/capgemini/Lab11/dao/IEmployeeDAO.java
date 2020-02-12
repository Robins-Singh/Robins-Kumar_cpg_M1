package com.capgemini.Lab11.dao;

import com.capgemini.Lab11.bean.Employee;

public interface IEmployeeDAO {
	public boolean addEmployee(Employee e);
	public Employee getEmployeeById(int id);
}
