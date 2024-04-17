package com.evs.vtiger.utils;

import java.io.IOException;

public class TakesScree {
	public static void main(String[] args) throws IOException {
	KishanWebUtil get=	KishanWebUtil.getobject();
	get.browserlauch("chrome");
	get.hitUrl("http://localhost:8888");
	get.takeSnapshot("Screenshot//kishan.png");
	}

}
