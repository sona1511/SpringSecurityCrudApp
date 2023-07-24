package com.example.cg.app.springbootexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "empId")
	int empId;

	@Column(name = "empAge")
	int empAge;

	@Column(name = "empName")
	String empName;

	public Employee() {

	}

	public Employee(int empId, int empAge, String empName) {
		super();
		this.empId = empId;
		this.empAge = empAge;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empAge=" + empAge + ", empName=" + empName + "]";
	}

}
