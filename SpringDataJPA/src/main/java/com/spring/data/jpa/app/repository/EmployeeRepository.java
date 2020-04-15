package com.spring.data.jpa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.spring.data.jpa.app.model.Employee;

//this is interface. implementaton is given by spring boot Data jpa only by using proxy design pattern
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//Proxy is a design used to generate code based on inputs class Class object(java.lan.)

}
