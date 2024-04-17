package com.eva.marketing.Leads;

import java.util.Map;

import com.evs.vtiger.utils.KishanWebUtil;

public class LeadsCreation extends LeadsOrLayer{
	protected KishanWebUtil kw=	KishanWebUtil.getobject();  
      private KishanWebUtil kc;
	public LeadsCreation(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
	}
	public void marketingLeadsCreation()
	{
		  kw.mydropdownindex(getFirstnameDropDown(), 2);
		 kc.mySenkeys(getFirstname(), "Kishan");
		 kc.mySenkeys(getLastname(), "Dubey");
		 kc.mySenkeys(getCompanyname(), "KhataruTextTile");
		 kc.mySenkeys(getPhone(), "8956969696");
		 kc.mySenkeys(getMobile(), "8956969696");
		 kc.mySenkeys(getEmail(), "kataru@gmail.com");
		 kc.mySenkeys(getDescription(),"This is KataruDescription");
		 
	}

}
