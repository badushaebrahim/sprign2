package com.badu.emp.Employees;

import org.springframework.data.repository.CrudRepository;

import antlr.collections.List;

public interface EmployeeRepository  extends CrudRepository<Employee,Long>{
	// List<Employee> findbylastname(String lastName);
	// Employee findbyid(Long id);
	// Iterable<Employee> findByLastName(String string);
	
}
