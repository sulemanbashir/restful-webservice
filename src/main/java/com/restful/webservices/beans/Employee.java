package com.restful.webservices.beans;

public class Employee {

	private Integer id = null;
	private String name = null;
	private String department = null;
	
	public Employee() {}
	
	public Employee(Integer id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
			
	
}
