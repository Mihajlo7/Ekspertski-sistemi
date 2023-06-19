package com.sample;

public class Klima {

	private String tip="zidna";
	private int snaga;
	private String inverter="nepoznat";
	
	private int velicinaStana;
	private String brojProstorija="nepoznato";
	private String nizeTemperature="nepoznato";
	private String ugradnjaNaZid="nepoznato";
	private String koriscenje="nepoznato";
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public int getSnaga() {
		return snaga;
	}
	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}
	public String getInverter() {
		return inverter;
	}
	public void setInverter(String inverter) {
		this.inverter = inverter;
	}
	public int getVelicinaStana() {
		return velicinaStana;
	}
	public void setVelicinaStana(int velicinaStana) {
		this.velicinaStana = velicinaStana;
	}
	public String getBrojProstorija() {
		return brojProstorija;
	}
	public void setBrojProstorija(String brojProstorija) {
		this.brojProstorija = brojProstorija;
	}
	public String getNizeTemperature() {
		return nizeTemperature;
	}
	public void setNizeTemperature(String nizeTemperature) {
		this.nizeTemperature = nizeTemperature;
	}
	public String getUgradnjaNaZid() {
		return ugradnjaNaZid;
	}
	public void setUgradnjaNaZid(String ugradnjaNaZid) {
		this.ugradnjaNaZid = ugradnjaNaZid;
	}
	
	public String getKoriscenje() {
		return koriscenje;
	}
	public void setKoriscenje(String koriscenje) {
		this.koriscenje = koriscenje;
	}
	@Override
	public String toString() {
		return "Klima [tip=" + tip + ", snaga=" + snaga + "BTU, inverter=" + inverter + "]";
	}
	
	
}
