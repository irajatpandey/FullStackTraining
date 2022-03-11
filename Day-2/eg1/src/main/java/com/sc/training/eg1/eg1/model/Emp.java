package com.sc.training.eg1.eg1.model;

public class Emp {
	int empId;
	String name;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Emp(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public Emp() {
	}
	
	

}
