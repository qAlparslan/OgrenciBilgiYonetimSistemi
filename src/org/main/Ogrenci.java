package org.main;
// Ogrencinin adı, soyadı, yaşı, numarası 

public class Ogrenci {
	private String ad;
	private String soyad;
	private int yas;
	private int numara;
	
	public Ogrenci(String ad, String soyad, int yas, int numara) {
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.numara = numara;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public int getYas() {
		return yas;
	}
	
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	public int getNumara() {
		return numara;
	}
	
	public void setNumara(int numara) {
		this.numara = numara;
	}
	
	@Override
	public String toString() {
		return "Öğrenci{"
				+ "Ad = " + ad + " | " +
				"Soyad = " + soyad + " | " +
				"Yaş = " + yas + " | " +
				"Numara = " + numara + 
				'}';
	}
}
