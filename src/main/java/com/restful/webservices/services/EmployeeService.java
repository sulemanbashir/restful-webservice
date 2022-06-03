package com.restful.webservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.webservices.beans.Employee;
import com.restful.webservices.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	
	public List<Employee> addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}
	
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	public Employee findEmployeeById(Integer employeeId) {
		return employeeDao.findEmployeeById(employeeId);
	}
	
	public List<Employee> deleteEmployeeById(Integer employeeId) {
		return employeeDao.deleteEmployeeById(employeeId);
	} 

}
