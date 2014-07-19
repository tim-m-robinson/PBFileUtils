package org.atos.nsi.pbchecker.tests;

import org.atos.nsi.pbchecker.PBFileUtils;

public class SimpleTest {
	
	private static final int n = 999;
	
	public static void main (String[] args) {
		PBFileUtils p = new PBFileUtils();
		System.out.println("Holder Number: "+p.generateHolderNo());
		System.out.println("PB Number    : "+p.generatePbNumber());
		System.out.println("Magic        : "+PBFileUtils.PBResultsAsString(p.generatePBResults(n)));
	}

}
