package org.atos.nsi.pbchecker;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class PBFileUtils {
	
	/*
	 * PB Number Format AANNNNNN
	 */
	
	final String holderNoChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	final String pbNumerics = "1234567890";
	final String pbChars = "ABCDEFGHJKLMNPQRSTVWXYZ";
	final Random rnd = new Random();
	
	public String generateHolderNo() {
		String result = "";
		for(int i=0;i<10;i++) {
			result += holderNoChars.charAt(rnd.nextInt(36));
		}
		return result;
	}
	
	public String generatePbNumber() {
		String result = "";
		// add two random alpha chars
		result += pbChars.charAt(rnd.nextInt(23));
		result += pbChars.charAt(rnd.nextInt(23));
		for(int i=0;i<6;i++) {
			result += pbNumerics.charAt(rnd.nextInt(10));
		}
		return result;
	}
	
	public List<PBResult> generatePBResults(int n) {
		List<PBResult> result = new ArrayList<PBResult>();
		if (n<0) n=0;
		for(int i=0;i<n;i++) {
			PBResult myPbResult = new PBResult();
			myPbResult.setHolderNo(this.generateHolderNo());
			for(int j=0;j<rnd.nextInt(99)+1;j++) {
				myPbResult.addPbNumber(this.generatePbNumber());
			}
			result.add(myPbResult);
		}
		return result;
	}
	
	public static String PBResultAsString(PBResult pbResult) {
		String result = "";
		result += pbResult.getHolderNo() + "=" + pbResult.getPbNumbersAsCsv();
		return result;
	}
	
	public static String PBResultsAsString(List<PBResult> pbResults) {
		String result = "";
		for( PBResult pbResult : pbResults ) {
			result += PBFileUtils.PBResultAsString(pbResult) + "\n"; 
		}
		return result;
	}

}
