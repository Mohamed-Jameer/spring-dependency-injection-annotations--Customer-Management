package com.ioc.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.Interface.Customer;
import com.ioc.classes.GoldCustomer;
import com.ioc.classes.PlatinumCustomer;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("Tap.xml");
		
		
		Customer gc = (GoldCustomer)cpx.getBean("goldCustomer");
		Customer pc = (PlatinumCustomer) cpx.getBean("platinumCustomer");
		
		// ((GoldCustomer)(gc)).setName("Rahul");
		// ((GoldCustomer)(gc)).setType("Gold Customer");;
		
		//((PlatinumCustomer)(pc)).setName("Virat");
		//((PlatinumCustomer)(pc)).setType("Platinum Customer");
		
		
		
		gc.defineCustomer();
		pc.defineCustomer();
		

	}

}
