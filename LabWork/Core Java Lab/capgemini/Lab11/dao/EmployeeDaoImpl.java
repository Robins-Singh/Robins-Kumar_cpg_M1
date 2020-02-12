package com.capgemini.Lab11.dao;

import java.util.HashMap;

import com.capgemini.Lab11.bean.Employee;

public class EmployeeDaoImpl implements IEmployeeDAO {
	private static HashMap<Integer, Employee> db = new HashMap<>();
	@Override
	public boolean addEmployee(Employee e) {
		db.put(e.getId(), e);
		return true;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return db.get(id);
	}

}
