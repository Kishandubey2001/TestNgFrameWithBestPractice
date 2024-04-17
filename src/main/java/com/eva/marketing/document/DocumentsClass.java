package com.eva.marketing.document;

import com.evs.vtiger.utils.KishanWebUtil;

public class DocumentsClass extends DocumentsORlayer{
  private KishanWebUtil kc;
	public DocumentsClass(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
		
	}
	
	public void createDocuments()
	{
		kc.mySenkeys(getTitle(), "KishanTitle");
//		kc.switchtoframeIndex(0);
//		kc.mySenkeys(getDescription(), "This is kishan dubey");
		
	}
	
	

}
