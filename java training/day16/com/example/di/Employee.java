package com.example.di;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

import java.util.*;

@Component
public class Employee {
	
	//@Value("10000")
	//@Value("#{10+40}")
	@Value("#{generator.generate()}")
	int id;

	//@Value("10/02/2010")
	@Value("#{(new java.util.Date()).toString()}")
	String dob;

	//Address address;
	
	/*@Autowired
	@Qualifier("home")
	Address homeAddress;

	@Autowired
	@Qualifier("office")
	Address officeAddress;*/

	//@Autowired
	//Address[] addresses;

	@Autowired
	Map<String,Address> addresses;

	//Set<Address> addresses;
	//List<Address> addresses;
	
	public Map<String,Address> getAddresses(){
		return this.addresses;
	}
	/*public List<Address> getAddresses(){
		return this.addresses;
	}*/

	/*public Address[] getAddresses(){
		return this.addresses;
	}*/

	/*public Address getHomeAddress(){
		return this.homeAddress;
	}

	public Address getOfficeAddress(){
		return this.officeAddress;
	}*/
	/*public Address getAddress(){
		return this.address;
	}*/

	/*@Autowired
	public void write(Address address){
		this.address = address;
	}*/

	/*@Autowired
	public void setAddress(Address address){
		this.address = address;
	}*/
}