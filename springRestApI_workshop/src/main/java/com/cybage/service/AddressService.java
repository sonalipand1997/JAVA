package com.cybage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.AddressRepository;
import com.cybage.model.Address;


@Service
public class AddressService {

	@Autowired
	AddressRepository addressRepository ;

	public void addAddress(Address address) {
		// TODO Auto-generated method stub
		addressRepository.save(address);
	}
}
