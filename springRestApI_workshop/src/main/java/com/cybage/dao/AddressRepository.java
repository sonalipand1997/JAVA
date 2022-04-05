package com.cybage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cybage.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer>{

	


}
