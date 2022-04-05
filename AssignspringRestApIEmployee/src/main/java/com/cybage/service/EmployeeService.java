package com.cybage.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cybage.dao.EmployeeRepository;
import com.cybage.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository  employeeRepository;

	public void addEmploye(Employee employee) {
		// TODO Auto-generated method stub
		 employeeRepository.save(employee);
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return  employeeRepository.findAll();
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	public Employee updateById(int id, Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	
	
	
}
