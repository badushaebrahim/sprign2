package com.badu.emp.Employees;

import java.util.concurrent.atomic.AtomicLong;

import javax.xml.bind.annotation.W3CDomHandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeControler {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/create")
	// public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
	// 	return new Greeting(counter.incrementAndGet(), String.format(template, name));
	// }
	public Employee Employee(@RequestParam(value = "firstname")String firstName,@RequestParam( value ="lastname")String lastName){
		System.out.println(lastName);
		System.out.println(firstName);
		Employee k =  new Employee(firstName, firstName);
		return k;
	}
}
