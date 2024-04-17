package com.eva.marketing.Account;

import java.util.Map;
import java.util.Random;

import com.evs.vtiger.utils.KishanWebUtil;

import net.bytebuddy.utility.RandomString;

public class AcccountCreation extends AccountORlayer{
   private KishanWebUtil kc;
   
	public AcccountCreation(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;	
	}
	
	public void marketingAccountCreation()
		{
		String rd=      RandomString.make(5);
		kc.mySenkeys(getAccountname(), "KishanAccount"+rd);
		kc.mySenkeys(getPhone(), "6393981252");
		kc.mySenkeys(getEmail(), "Bhagelu@gmail.com"+rd);
		kc.mySenkeys(getDescription(),"This is Kishan Account");
		
	}
		
}
