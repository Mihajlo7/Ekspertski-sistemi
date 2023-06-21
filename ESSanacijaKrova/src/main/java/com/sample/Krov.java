package com.sample;

public class Krov {

	private double kvadratura=0;
	private String prokisnjava="nepoznato";
	private int nedostajuciCrepovi=0;
	private boolean ulegao=false;
	private boolean postojiDrvo=false;
	private boolean oluciZardjali=false;
	
	private String potrebniRadovi="";
	private double ukupnaCena=0;

	
	public double getUkupnaCena() {
		return ukupnaCena;
	}

	public void setUkupnaCena(double ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}

	public double getKvadratura() {
		return kvadratura;
	}

	public void setKvadratura(double kvadratura) {
		this.kvadratura = kvadratura;
	}

	public String getProkisnjava() {
		return prokisnjava;
	}

	public void setProkisnjava(String prokisnjava) {
		this.prokisnjava = prokisnjava;
	}

	public int getNedostajuciCrepovi() {
		return nedostajuciCrepovi;
	}

	public void setNedostajuciCrepovi(int nedostajuciCrepovi) {
		this.nedostajuciCrepovi = nedostajuciCrepovi;
	}

	public boolean isUlegao() {
		return ulegao;
	}

	public void setUlegao(boolean ulegao) {
		this.ulegao = ulegao;
	}

	public boolean isPostojiDrvo() {
		return postojiDrvo;
	}

	public void setPostojiDrvo(boolean postojiDrvo) {
		this.postojiDrvo = postojiDrvo;
	}

	public boolean isOluciZardjali() {
		return oluciZardjali;
	}

	public void setOluciZardjali(boolean oluciZardjali) {
		this.oluciZardjali = oluciZardjali;
	}

	public String getPotrebniRadovi() {
		return potrebniRadovi;
	}

	public void setPotrebniRadovi(String potrebniRadovi) {
		this.potrebniRadovi = potrebniRadovi;
	}

	@Override
	public String toString() {
		return "Krov [kvadratura=" + kvadratura + ", prokisnjava=" + prokisnjava + ", nedostajuciCrepovi="
				+ nedostajuciCrepovi + ", ulegao=" + ulegao + ", postojiDrvo=" + postojiDrvo + ", oluciZardjali="
				+ oluciZardjali+"]" +"\n********\n"+ "potrebniRadovi=" + potrebniRadovi+"\nukupnaCena="+ukupnaCena;
	}
	
	
}
