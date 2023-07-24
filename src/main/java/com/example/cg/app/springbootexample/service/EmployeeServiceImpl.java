package com.example.cg.app.springbootexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cg.app.springbootexample.model.Employee;
import com.example.cg.app.springbootexample.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String addEmployee(Employee emp) {
		employeeRepository.save(emp);
		return "employee successfully added";
	}

	@Override
	public String removeEmployee(int empId) {
		employeeRepository.deleteById(empId);
		return "employee successfully deleted";
	}

	@Override
	public void updateEmployee(Employee emp) {

		employeeRepository.save(emp);
	}

	@Override
	public Optional<Employee> getById(int empId) {
		return employeeRepository.findById(empId);

	}

	@Override
	public List<Employee> getAllById() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee partialUpdateEmp(Employee emp, int empId) {

		Employee updateEmployee = employeeRepository.findById(empId).get();
		updateEmployee.setEmpId(emp.getEmpId());
		updateEmployee.setEmpAge(emp.getEmpAge());

		return employeeRepository.save(updateEmployee);

		/*
		 * Optional<Employee> newEmployee = employeeRepository.findById(empId);
		 * if(newEmployee.isPresent())
		 * 
		 * { Employee resultEmp = new Employee(); resultEmp.setEmpId(emp.getEmpId());
		 * resultEmp.setEmpName(emp.getEmpName()); resultEmp.setEmpAge(emp.getEmpAge());
		 * } return employeeRepository.save(newEmployee.get());
		 */

	}

	@Override
	public List<Employee> findByEmpName(String empName) {

		return employeeRepository.findByEmpName(empName);
	}

	@Override
	public List<Employee> findByEmpAge(int empAge) {
		return employeeRepository.findByEmpAge(empAge);
	}

	@Override
	public List<Employee> findByEmpNameStartingWith(String empName) {
		return employeeRepository.findByEmpNameStartingWith(empName);
	}

	@Override
	public List<Employee> findByIdGreaterThanEqual(int empId) {
		return employeeRepository.findByIdGreaterThanEqual(empId);
	}

	@Override
	public List<Employee> findByNameContains(String empName) {
		return employeeRepository.findByNameContains(empName);
	}

}
