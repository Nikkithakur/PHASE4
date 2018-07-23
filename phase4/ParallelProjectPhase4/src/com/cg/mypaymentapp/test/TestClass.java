/* Delete Table rows completely, so that existing data would not conflict with these test cases
		*/

package com.cg.mypaymentapp.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.mypaymentapp.beans.*;
import com.cg.mypaymentapp.exception.*;
import com.cg.mypaymentapp.service.*;

public class TestClass {

	/* Delete Table rows completely, so that existing data would not conflict with these test cases
		*/
	@Test
	public void empty() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","corp123");
		String sql="delete from customer";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.executeUpdate();
	}
	
/*	
	@Test(expected=InvalidInputException.class)
	public void exceptionTest1() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","9032858312m",new BigDecimal(25000));
			   
	}
	
	
	
	
	
	@Test(expected=InvalidInputException.class)
	public void exceptionTest2() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","90328",new BigDecimal(25000));
			   
	}
	
	@Test(expected=InvalidInputException.class)
	public void exceptionTest3() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","9032858312",new BigDecimal(25000));
	 service.createAccount("Thakur","9032858312",new BigDecimal(5000));
			   
	}
	
	@Test(expected=InvalidInputException.class)
	public void exceptionTest4() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","",new BigDecimal(25000));
			   
	}
	

	
	
	@Test(expected=InvalidInputException.class)
	public void exceptionTest6() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("","",new BigDecimal(25000));
			   
	}
		
	@Test
	public void objectCustomer() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","1234567893",new BigDecimal(25000));   
	}
	
	
	
	@Test(expected=InvalidInputException.class)
	public void showbalanceTest() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","9032858312",new BigDecimal(25000));
	 service.showBalance("90328583");
	 }
	
	
	
	@Test(expected=InsufficientBalanceException.class)
	public void insufficientamountTest() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","1234567890",new BigDecimal(25000));
	 service.createAccount("thakur","1234567891",new BigDecimal(10000)); 
	 service.fundTransfer("1234567890", "1234567891", new BigDecimal(26000));
	 }
	
	@Test(expected=InvalidInputException.class)
	public void negativeFundTransferTest() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","9032858312",new BigDecimal(25000));
	 service.createAccount("thakur","9849934120",new BigDecimal(10000)); 
	 service.fundTransfer("9032858312", "9849934120", new BigDecimal(-10000));
	 }
	
	@Test(expected=InvalidInputException.class)
	public void fundTransferTest() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","9032858312",new BigDecimal(25000));
	 service.createAccount("thakur","9849934120",new BigDecimal(10000)); 
	 service.fundTransfer("903285832", "9934120", new BigDecimal(-10000));
	 }
	
	@Test(expected=InvalidInputException.class)
	public void fundTransferTest1() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","9032858312",new BigDecimal(25000));
	 service.createAccount("thakur","9849934120",new BigDecimal(10000)); 
	 service.fundTransfer("", "9849934120", new BigDecimal(-10000));
	 }
	
	
	
	
	@Test(expected=InvalidInputException.class)
	public void depositTest1() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","9032858312",new BigDecimal(-25000)); 
	}
	
	@Test
	public void depositTest2() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 Customer c=service.createAccount("nikhil","1234567886",new BigDecimal(25000));
	 c=service.depositAmount("1234567886",new BigDecimal(5000));
	 assertEquals(c.getName(),"nikhil");
	}
	
	@Test
	public void depositTest3() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 Customer c=service.createAccount("nikhil","1234567867",new BigDecimal(25000));
	 c=service.depositAmount("1234567867",new BigDecimal(5000));
	 assertEquals(c.getMobileNo(),"1234567867");
	}
	
	
	
	
	

	@Test(expected=InsufficientBalanceException.class)
	public void insufficientamountTest1() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","1234567894",new BigDecimal(25000));
	 service.withdrawAmount("1234567894", new BigDecimal(26000)); 
	 
	 }
	
	
	
	@Test(expected=InvalidInputException.class)
	public void insufficientamountTest2() throws Exception 
	{
	 WalletService   service=new WalletServiceImpl();
	 service.createAccount("nikhil","9032858312",new BigDecimal(25000));
	 service.withdrawAmount("90328583m", new BigDecimal(2000)); 
	 
	 }
	*/
	

}
