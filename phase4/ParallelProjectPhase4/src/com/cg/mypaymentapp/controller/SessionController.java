package com.cg.mypaymentapp.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.service.WalletService;




@Controller
public class SessionController {
	
	@Autowired(required=true)
	private WalletService services;
	
	@PostMapping("/createaccount")
	public ModelAndView saveDetails(@ModelAttribute("customer") Customer customer) throws Exception
	{
		customer=services.createAccount(customer.getName(), customer.getMobileNo(), customer.getWallet().getBalance());
		ModelAndView mav=new ModelAndView("success","customer",customer);
		return mav;
	}
	
	@RequestMapping("/displayBal")
	public ModelAndView getDetails(@ModelAttribute("customer") Customer customer) throws Exception
	{
		customer=services.showBalance(customer.getMobileNo());
		ModelAndView mav=new ModelAndView("displayBalance","customer",customer);
		return mav;
	}
	
	@RequestMapping("/depositamount")
	public ModelAndView deposit(@ModelAttribute("customer") Customer customer) throws Exception
	{
		customer=services.depositAmount(customer.getMobileNo(),customer.getWallet().getBalance());
		ModelAndView mav=new ModelAndView("updatedMoney","customer",customer);
		return mav;
	}
	
	@RequestMapping("/withdrawamount")
	public ModelAndView withdrawal(@ModelAttribute("customer") Customer customer) throws Exception
	{
		customer=services.withdrawAmount(customer.getMobileNo(),customer.getWallet().getBalance());
		ModelAndView mav=new ModelAndView("updatedMoney","customer",customer);
		return mav;
	}
	
	@RequestMapping("/fund")
	public ModelAndView fundtransfer(@ModelAttribute("customer") Customer customer) throws Exception
	{
		customer=services.fundTransfer(customer.getMobileNo(),customer.getName(),customer.getWallet().getBalance());
		ModelAndView mav=new ModelAndView("updatedMoney","customer",customer);
		return mav;
	}
	
	
	
	

}
