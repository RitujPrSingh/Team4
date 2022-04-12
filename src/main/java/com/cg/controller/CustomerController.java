package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Customer;
import com.cg.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/addCustomer")
	public String addBook(@RequestBody Customer customer)
	{
		return customerService.addCustomer(customer);
	}
	
	@GetMapping("/issuedToken/{id}")
	public int getToken(@PathVariable("id") int id)
	{
		return customerService.getTokenNum(id);
	}
	
	@GetMapping("/choosePos/{id}/{positionNum}")
	public int getToken(@PathVariable("id") int id,@PathVariable("positionNum") int positionNum)
	{
		return customerService.choosePosition(id, positionNum);
	}

}