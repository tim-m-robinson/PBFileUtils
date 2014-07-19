package org.atos.nsi.pbchecker;

import java.util.List;
import java.util.ArrayList;

public class PBResult {
	
	private String holderNo = "";
	private List<String> pbNumbers = new ArrayList<String>();
	
	public String getHolderNo() {
		return holderNo;
	}
	
	public void setHolderNo(String holderNo) {
		this.holderNo = holderNo;
	}
	
	public List<String> getPbNumbers() {
		return pbNumbers;
	}
	
	public String getPbNumbersAsCsv() {
		String result = "";
		for (String pbNumber : getPbNumbers()) {
			result += pbNumber + ",";
		}
		if (result.length() > 0) {
			result = result.substring(0, result.length() - 1);
		}
		return result;
	}
	
	public void setPbNumbers(List<String> pbNumbers) {
		this.pbNumbers = pbNumbers;
	}
	
	public void addPbNumber(String pbNumber) {
		this.pbNumbers.add(pbNumber);
	}
	
	

}
