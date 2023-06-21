package com.sample;

public class Laptop {

	private String namena="";
	private String vrstaIgrice="/";
	private String nosenje="";
	
	private String procesor="nepoznato";
	private int ramMemorija=-1;
	private int velicinaEkrana=-1;
	private int velicinaMemorije=-1;
	private String tipGraficke="nepoznato";
	@Override
	public String toString() {
		return "RESENJE\nProcesor: "+procesor+"\nRAM Memorija: "+ramMemorija+" GB\nVelicina ekrana: "+velicinaEkrana+" inca\nVelicna memorije: "+velicinaMemorije+
				" GB\nTip graficke: "+tipGraficke;
	}
	public String getNamena() {
		return namena;
	}
	public void setNamena(String namena) {
		this.namena = namena;
	}
	public String getVrstaIgrice() {
		return vrstaIgrice;
	}
	public void setVrstaIgrice(String vrstaIgrice) {
		this.vrstaIgrice = vrstaIgrice;
	}
	public String getNosenje() {
		return nosenje;
	}
	public void setNosenje(String nosenje) {
		this.nosenje = nosenje;
	}
	public String getProcesor() {
		return procesor;
	}
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	public int getRamMemorija() {
		return ramMemorija;
	}
	public void setRamMemorija(int ramMemorija) {
		this.ramMemorija = ramMemorija;
	}
	public int getVelicinaEkrana() {
		return velicinaEkrana;
	}
	public void setVelicinaEkrana(int velicinaEkrana) {
		this.velicinaEkrana = velicinaEkrana;
	}
	public int getVelicinaMemorije() {
		return velicinaMemorije;
	}
	public void setVelicinaMemorije(int velicinaMemorije) {
		this.velicinaMemorije = velicinaMemorije;
	}
	public String getTipGraficke() {
		return tipGraficke;
	}
	public void setTipGraficke(String tipGraficke) {
		this.tipGraficke = tipGraficke;
	}
	
	
}
