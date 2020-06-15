package com.wazuweb.model.dto;

public class RespuestasDTO {

	
	private int CODR;
	private int CODP;
	private String RES;
	private String RESCO;
	
	
	public String getRESCO() {
		return RESCO;
	}
	public void setRESCO(String rESCO) {
		RESCO = rESCO;
	}
	public int getCODR() {
		return CODR;
	}
	public void setCODR(int cODR) {
		CODR = cODR;
	}
	public int getCODP() {
		return CODP;
	}
	public void setCODP(int cODP) {
		CODP = cODP;
	}
	public String getRES() {
		return RES;
	}
	public void setRES(String rES) {
		RES = rES;
	}
}