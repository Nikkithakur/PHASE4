package com.cg.mypaymentapp.service;
import java.math.BigDecimal;

import com.cg.mypaymentapp.beans.Customer;


public interface WalletService {
public Customer createAccount(String name, String mobileNo, BigDecimal amount) throws Exception;
public Customer showBalance (String mobileno) throws Exception;
public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount) throws Exception;
public Customer depositAmount (String mobileNo,BigDecimal amount ) throws Exception;
public Customer withdrawAmount(String mobileNo, BigDecimal amount) throws Exception;

}
