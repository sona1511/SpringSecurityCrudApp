package com.example.cg.app.springbootexample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cg.app.springbootexample.model.Employee;
import com.example.cg.app.springbootexample.service.EmployeeServiceImpl;

/**
 * 
 * @author 10723147
 *
 */

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@RequestMapping("/home")
	public String getHome() {
		return "Welcome to Sona's home";
	}

	@RequestMapping("/integer")
	public int getInt() {
		return 10;
	}

	/**
	 * 
	 * @param emp
	 * @return
	 */

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee emp) {
		return employeeServiceImpl.addEmployee(emp);

	}

	/**
	 * 
	 * @param empId
	 * @return
	 */

	@DeleteMapping("/removeEmployee/{empId}")
	public String removeEmployee(@PathVariable int empId) {
		return employeeServiceImpl.removeEmployee(empId);

	}

	/**
	 * 
	 * @param emp
	 */
	@PutMapping("/updateEmployee")
	public void updateEmployee(@RequestBody Employee emp) {
		employeeServiceImpl.updateEmployee(emp);
	}

	/**
	 * 
	 * @param empId
	 * @return
	 */
	@GetMapping("/getEmpById/{empId}")
	public Optional<Employee> getEmpById(@PathVariable int empId) {
		return employeeServiceImpl.getById(empId);
	}

	/**
	 * 
	 * @return
	 */

	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmpDetails() {
		return employeeServiceImpl.getAllById();
	}

	/**
	 * 
	 * @param emp
	 * @param empId
	 * @return
	 */

	@PatchMapping("/partialUpdateEmployee/{empId}")
	public Employee partialUpdateEmployee(@RequestBody Employee emp, @PathVariable int empId) {
		return employeeServiceImpl.partialUpdateEmp(emp, empId);
	}

	/***
	 * 
	 * @param empName
	 * @return
	 */

	@GetMapping("/getByName/{empName}")
	public List<Employee> getEmployeeByName(@PathVariable String empName) {
		return employeeServiceImpl.findByEmpName(empName);

	}

	/**
	 * 
	 * @param empAge
	 * @return
	 */

	@GetMapping("/getByAge/{empAge}")
	public List<Employee> getEmployeeByAge(@PathVariable int empAge) {
		return employeeServiceImpl.findByEmpAge(empAge);
	}

	/**
	 * 
	 * @param empName
	 * @return
	 */

	@GetMapping("/getByNameStarts/{empName}")
	public List<Employee> getEmployeeByNameStartingWith(@PathVariable String empName) {
		return employeeServiceImpl.findByEmpNameStartingWith(empName);

	}

	/**
	 * 
	 * @param empId
	 * @return
	 */

	@GetMapping("/getByAgeGreaterThan/{empId}")
	public List<Employee> getEmployeeByAgeGreaterThanEqualTo(@PathVariable int empId) {
		return employeeServiceImpl.findByIdGreaterThanEqual(empId);
	}

	/**
	 * 
	 * @param empName
	 * @return
	 */

	@GetMapping("/getByNameContains/{empName}")
	public List<Employee> getEmployeeByNameContains(@PathVariable String empName) {
		return employeeServiceImpl.findByNameContains(empName);

	}
}
