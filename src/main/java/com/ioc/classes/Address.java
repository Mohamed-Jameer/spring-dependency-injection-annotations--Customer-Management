package com.ioc.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Autowired
	@Value("Bangalore")
	private String city;
	
	@Autowired
	@Value("Karnataka")
	private String state;
	
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return city + "," + state ;
	}
	

	
	

}
