package com.cybage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cybage.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	

}
