package com.eva.marketing.Documents;

import com.evs.vtiger.utils.KishanWebUtil;

public class DocumentCeation extends DocumentsOrlayer{
    private KishanWebUtil kc;
	public DocumentCeation(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
		
	}
	public void documentsCreation()
	{
		kc.mySenkeys(getTitle(), "KishanTitle");
		kc.switchtoframeIndex(0);
		kc.mySenkeys(getDescriptiontextbox(), "This is Kishan Dubey Documents");
		kc.switchoutFromeFrame();
		 kc.mydropdownindex(getFileupload(), 0);
		 kc.mySenkeys(getChoosefile(), "‪C:\\Users\\dell\\Pictures\\heap scp.png");
		 
	}

}
