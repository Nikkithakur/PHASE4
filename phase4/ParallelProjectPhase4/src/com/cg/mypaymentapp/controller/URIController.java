package com.cg.mypaymentapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.mypaymentapp.beans.Customer;

@Controller
public class URIController {

	@RequestMapping("/")
	public String getIndexPage() {
		return "indexPage";
	}
	
	
	@RequestMapping("/register")
	public String getRegistrationPage() {
		return "registrationPage";
	}
	
	
	
	@RequestMapping("/transfer")
	public String getTransferMoney() {
		return "fundTransfer";
	}
	
	@RequestMapping("/display")
	public String getUser() {
		return "showBalance";
	}
	
	@RequestMapping("/withdraw")
	public String getWithdrawDetails() {
		return "withdrawMoney";
	}
	
	@RequestMapping("/deposit")
	public String getDepositDetails() {
		return "depositMoney";
	}
	
	
	
	@ModelAttribute("customer")
		public Customer getCustomer() {
		return new Customer();
	}
	
}
