package com.pro.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pro.springmvc.model.Customer;
import com.pro.springmvc.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	public String listCustomers(@ModelAttribute Customer customer)
	{
		List<Customer>	clist=	customerService.getCustomers();
		ModelAndView mv=new ModelAndView();
		mv.addObject("clist",clist);
		return "list-customers";
	}


}
