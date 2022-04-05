package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.CustomerRepository;
import com.cybage.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		 customerRepository.save(customer);
	}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		 customerRepository.deleteById(id);
	}

	public Customer updateById(int id, Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save( customer);
	}

	public Customer getById(int id) {
	
		Customer customer=customerRepository.findById(id).orElse(null);
		System.out.println(customer);
		return customer;
	}
	
	
}
