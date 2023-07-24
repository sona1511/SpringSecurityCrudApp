package com.example.cg.app.springbootexample.service;

import java.util.List;
import java.util.Optional;

import com.example.cg.app.springbootexample.model.Employee;

interface EmployeeService {

	public String addEmployee(Employee emp);

	public String removeEmployee(int empId);

	public void updateEmployee(Employee emp);

	public Employee partialUpdateEmp(Employee emp, int empId);

	public Optional<Employee> getById(int empId);

	public List<Employee> getAllById();

	public List<Employee> findByEmpName(String empName);

	public List<Employee> findByEmpAge(int empAge);

	public List<Employee> findByEmpNameStartingWith(String empName);

	public List<Employee> findByIdGreaterThanEqual(int empId);

	public List<Employee> findByNameContains(String empName);

}
