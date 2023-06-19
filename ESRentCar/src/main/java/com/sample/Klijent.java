package com.sample;

public class Klijent {
	
	private int godine;
	private String kategorija="nepoznato";
	private double vazenje=-1;
	
	private String dozvoljenoIzdavanje="nepoznato";
	private String potrebanDepozit="nepoznato";
	private int depozit=-1;
	private String klasaVozila="nepoznato";
	
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	public String getKategorija() {
		return kategorija;
	}
	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}
	public double getVazenje() {
		return vazenje;
	}
	public void setVazenje(double vazenje) {
		this.vazenje = vazenje;
	}
	public int getDepozit() {
		return depozit;
	}
	public void setDepozit(int depozit) {
		this.depozit = depozit;
	}
	public String getKlasaVozila() {
		return klasaVozila;
	}
	public void setKlasaVozila(String klasaVozila) {
		this.klasaVozila = klasaVozila;
	}
	public String getDozvoljenoIzdavanje() {
		return dozvoljenoIzdavanje;
	}
	public void setDozvoljenoIzdavanje(String dozvoljenoIzdavanje) {
		this.dozvoljenoIzdavanje = dozvoljenoIzdavanje;
	}
	
	
	public String getPotrebanDepozit() {
		return potrebanDepozit;
	}
	public void setPotrebanDepozit(String potrebanDepozit) {
		this.potrebanDepozit = potrebanDepozit;
	}
	public String ispis() {
		String res= "Resenje\nDozvoljeno izdavanje vozila:"+dozvoljenoIzdavanje+"\nDa li je potreban depozit:"+potrebanDepozit;
		if(potrebanDepozit=="jeste") {
			res=res+"\nDepozit: "+depozit;
		}
		res=res+"\nKlase vozila:"+klasaVozila;
		return res;
				
	}
	

}
