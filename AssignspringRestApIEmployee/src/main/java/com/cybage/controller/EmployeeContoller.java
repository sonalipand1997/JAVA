package com.cybage.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.cybage.model.Employee;
import com.cybage.service.EmployeeService;

@RestController
public class EmployeeContoller{
	
	@Autowired
	EmployeeService employeeService;
	
	private EmployeeService  employeeRepository;
	
	
	
	

	@PostMapping("/addEmployee")  // when client send the request also client send the data 
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee)
	
	{      employeeService.addEmploye(employee);
		return new ResponseEntity<String>("employee added successfully",HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll()
	{
		return employeeService.getAll();
		
	}
	
	
	
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id)
	{
		employeeService.deleteById(id);
		return new ResponseEntity<String>("delete employee sucessfully",HttpStatus.OK);
	}
	
	
	
	
	@PutMapping("/updateById/{id}")
	public ResponseEntity<String> updateById(@PathVariable int id, @RequestBody Employee employee)
	{
		Employee  employee1 = employeeService.updateById(id,employee);
		return new ResponseEntity<String>("Update employee sucessfully",HttpStatus.OK);
	}
	
}
