package com.psl.sprinboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.psl.sprinboot.entity.Employee;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //By default Spring DATA REST automatically generates the endpoints or URI by some conventions
	//Here conventions are like generating the plural forms of entity with first letter as small.
    //Eg - for "Employee" it will be "employees"
	//We can define our own endpoints by using @RepositoryRestResource annotations
	//Here instead of "employees" I have used "members"
	//so my endpoint will be like this "http://localhost:8080/api/members
	//by default endpoint is like this "http://localhost:8080/api/employees" for my example
	
	
	//that's it .. no need to  write any code like we did in DAO and DAO Implementation classes.
}
