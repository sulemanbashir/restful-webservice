package com.restful.webservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.webservices.beans.Employee;
import com.restful.webservices.services.EmployeeService;

@RestController
public class Controller {
	
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	public String getWebServiceStatus(){
		return "Restful Webservice is up!!";
	}
	
	@GetMapping("/getAllEmployeesData")
	public List<Employee> getAllEmployeesData(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/getEmployeeInfo/{id}")
	public Employee getAllEmployeesData(@PathVariable("id") String id){
		return employeeService.findEmployeeById(Integer.parseInt(id));
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public List<Employee> deleteEmployee(@PathVariable("id") String id){
		return employeeService.deleteEmployeeById(Integer.parseInt(id));
	}
	
	@PostMapping("/addEmployee")
	public List<Employee> deleteEmployee(@RequestBody Employee employee){
		return employeeService.addEmployee(employee);
	}
}
