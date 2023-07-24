package com.example.cg.app.springbootexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.cg.app.springbootexample.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findByEmpName(String empName);

	public List<Employee> findByEmpAge(int empAge);

	public List<Employee> findByEmpNameStartingWith(String empName);

	@Query("SELECT e FROM Employee e WHERE e.empId >= ?1")
	public List<Employee> findByIdGreaterThanEqual(int empId);

	@Query(value = "SELECT * from Employee e WHERE e.empName LIKE %?1%", nativeQuery = true)
	public List<Employee> findByNameContains(String empName);

	// by default it used Query definition uses JPQL in order to dfine SQL native
	// native SQL
	// set the value of the nativeQuery attribute to true and define the native SQL
	// query in the value
	// attribute of the annotation:
	// @Query(value = "SELECT * FROM Employee e WHERE e.empId >= ?1", nativeQuery =
	// true)

}
