package kulubum.taslak.model;

import java.time.LocalDate;

public class Kisi {

	protected  int Id;
	protected  String isim;
	protected  String soyad;
	protected LocalDate dogumTarihi;
	protected String adres;
	
	public int getYas() {
		return LocalDate.now().getYear() - dogumTarihi.getYear();
	}
	
	public  String getAdSoyad() {
		return String.format("%s\t%s", isim, soyad);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public  String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

}
