package com.cybage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Address;
import com.cybage.model.Customer;
import com.cybage.service.AddressService;
import com.cybage.service.CustomerService;

@RestController
public class AddressController {

	

	@Autowired
	AddressService addressService;
	
	private AddressService addressRepository  ;
	
	

	@PostMapping("/addAddress")  // when client send the request also client send the data 
	public ResponseEntity<String> addAddress(@RequestBody Address  address )
	
	{
		addressService.addAddress( address );
		return new ResponseEntity<String>("address added successfully",HttpStatus.CREATED);
	}
	
}
