package com.capgemini.Lab10CaseStudy;
import java.util.ArrayList;
import java.util.HashMap;
public class EmployeeService {

	static HashMap<String, Integer> deptEmpCount = new HashMap<>();
	public static void addSalary(ArrayList<Employee> emp) {
		System.out.println("Sum of Salary = "+emp.stream().map(e->e.getSalary()).reduce(0.0,Double::sum));
	}
	
	public static void departmentWithEmpCount(ArrayList<Employee> emp) {
		emp.stream().filter(e->e.getDept()!=null).map(e->e.getDept().getDepartmentName()).forEach(e->{
			if(deptEmpCount.containsKey(e)) {
				deptEmpCount.put(e, deptEmpCount.get(e)+1);
			}
			else {
				deptEmpCount.put(e, 1);
			}
		});
		
		System.out.println(deptEmpCount);
	}

	public static void departmentWithHighestEmp() {
		//System.out.println("Department with Maximum Employee : "+ deptEmpCount.keySet().stream().map(e->deptEmpCount.get(e)).reduce(Integer::max).get());
		System.out.println("Department with Maximum Employee : "+deptEmpCount.keySet().stream().max((e1,e2)->deptEmpCount.get(e1)>deptEmpCount.get(e2)?1:-1).get());
	}

	public static void employeesWithoutDept(ArrayList<Employee> emp) {
		emp.stream().filter(e->e.getDept()==null).map(e->e.getFirstName()).forEach(e->System.out.print(e+", "));
	}

	public static void DepartmenWithoutEmp() {
		deptEmpCount.keySet().stream().forEach(e->{
			if(deptEmpCount.get(e)==0){
				System.out.println(e);
			}
			else{
				System.out.println("No such department found");
			}
		});
	}
	

}
