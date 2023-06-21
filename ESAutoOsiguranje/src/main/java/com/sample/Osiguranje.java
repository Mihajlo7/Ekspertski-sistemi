package com.sample;

public class Osiguranje {
	
	private int snaga=-1;
	private String registracija="nepoznato";
	private int premijaProsleGodine=0;
	private int saobracajneNesrece=-1;
	
	private double osnovnaCena=-1;
	private int premijaTekuceGodine=0;
	private double konacnaCena=-1;
	public int getSnaga() {
		return snaga;
	}
	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}
	public String getRegistracija() {
		return registracija;
	}
	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}
	public int getPremijaProsleGodine() {
		return premijaProsleGodine;
	}
	public void setPremijaProsleGodine(int premijaProsleGodine) {
		this.premijaProsleGodine = premijaProsleGodine;
	}
	public int getSaobracajneNesrece() {
		return saobracajneNesrece;
	}
	public void setSaobracajneNesrece(int saobracajneNesrece) {
		this.saobracajneNesrece = saobracajneNesrece;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	public int getPremijaTekuceGodine() {
		return premijaTekuceGodine;
	}
	public void setPremijaTekuceGodine(int premijaTekuceGodine) {
		this.premijaTekuceGodine = premijaTekuceGodine;
	}
	public double getKonacnaCena() {
		return konacnaCena;
	}
	public void setKonacnaCena(double konacnaCena) {
		this.konacnaCena = konacnaCena;
	}
	@Override
	public String toString() {
		return "Osiguranje [osnovnaCena=" + osnovnaCena + ", premijaTekuceGodine=" + premijaTekuceGodine
				+ ", konacnaCena=" + konacnaCena + "]";
	}
	
	

}
