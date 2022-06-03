package com.restful.webservices.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.restful.webservices.beans.Employee;

@Repository
public class EmployeeDao {
	
	public static List<Employee> employeeList = new ArrayList<>();
	
	private Integer employeeId = 3;
	static {
		employeeList.add(new Employee(1,"john","Backend"));
		employeeList.add(new Employee(2,"snow","Frontend"));
	}
	
	
	public List<Employee> addEmployee(Employee employee) {
		employee.setId(employeeId);
		employeeId++;
		employeeList.add(employee);
		return employeeList;
	}
	
	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	public Employee findEmployeeById(Integer employeeId) {
		for(Employee employee : employeeList) {
			if(employeeId == employee.getId()) {
				return employee;
			}
		}
		return null;
	}
	
	public List<Employee> deleteEmployeeById(Integer employeeId) {
		List<Employee> employeeListTemp = new ArrayList<>();
		for(Employee employee : employeeList) {
			if(employeeId == employee.getId()) {
				continue;
			}
			employeeListTemp.add(employee);
		}
		employeeList = employeeListTemp;
		return employeeList;
	}
}
