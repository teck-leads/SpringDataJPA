package com.spring.data.jpa.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.data.jpa.app.model.Employee;
import com.spring.data.jpa.app.repository.EmployeeRepository;
import com.spring.data.jpa.app.service.EmployeeService;
@Component
public class UpdateAndSave implements CommandLineRunner {
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private EmployeeRepository repository;
	@Override
	public void run(String... args) throws Exception {
		
		Employee emp1=new Employee(10, "madhav", 20.4);
		Employee emp2=new Employee(11, "teja", 22.4);
		repository.save(emp1);
		repository.save(emp2);
		 
		
List<Employee> findAll = repository.findAll();
		
		findAll.stream()
		.forEach(System.out::println);
		System.out.println("findAll done");
		emp2=new Employee(11, "teja", 353453.54);
		repository.save(emp2);
findAll = repository.findAll();
		
		findAll.stream()
		.forEach(System.out::println);
	}

}
