package com.cybage.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Address_customer")
public class Address {
	@Id
	@GeneratedValue
	private int address_Id;
	private String city;
	private String state;
	
	@ManyToOne
	Customer customer;

	public Address(int address_Id, String city, String state, Customer customer) {
		super();
		this.address_Id = address_Id;
		this.city = city;
		this.state = state;
		this.customer = customer;
	}

	public int getAddress_Id() {
		return address_Id;
	}

	public void setAddress_Id(int address_Id) {
		this.address_Id = address_Id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [address_Id=" + address_Id + ", city=" + city + ", state=" + state + ", customer=" + customer
				+ "]";
	}
	

	
	
	
	

}
