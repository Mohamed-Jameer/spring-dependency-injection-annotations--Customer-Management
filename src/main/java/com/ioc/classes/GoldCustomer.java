package com.ioc.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ioc.Interface.Customer;

@Component
public class GoldCustomer implements Customer {
	@Autowired
	@Value("Virat")
	private String name;
	@Autowired
	@Value("Gold Customer")
	private String type;
	@Autowired
	@Qualifier("address")
	private Address address;
	
	


	public GoldCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public void defineCustomer() {
		
		System.out.println(name +" is a "+type+" from "+ address);

	}

}
