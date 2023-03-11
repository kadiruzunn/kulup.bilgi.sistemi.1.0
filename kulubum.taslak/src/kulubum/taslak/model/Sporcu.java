package kulubum.taslak.model;

public class Sporcu extends Kisi {

	protected int kusakDerecesi;
	protected String yaristigiAlan;
	protected String yaristigiYasGrubu;
	protected int altinMadalyaSayisi;
	protected int gumusMadalyaSayisi;
	protected int bronzMadalyaSayisi;

	public int getKusakDerecesi() {
		return kusakDerecesi;
	}

	public void setKusakDerecesi(int kusakDerecesi) {
		this.kusakDerecesi = kusakDerecesi;
	}

	public String getYaristigiAlan() {
		return yaristigiAlan;
	}

	public void setYaristigiAlan(String yaristigiAlan) {
		this.yaristigiAlan = yaristigiAlan;
	}

	public String getYaristigiYasGrubu() {
		return yaristigiYasGrubu;
	}

	public void setYaristigiYasGrubu(String yaristigiYasGrubu) {
		this.yaristigiYasGrubu = yaristigiYasGrubu;
	}

	public int getAltinMadalyaSayisi() {
		return altinMadalyaSayisi;
	}

	public void setAltinMadalyaSayisi(int altinMadalyaSayisi) {
		this.altinMadalyaSayisi = altinMadalyaSayisi;
	}

	public int getGumusMadalyaSayisi() {
		return gumusMadalyaSayisi;
	}

	public void setGumusMadalyaSayisi(int gumusMadalyaSayisi) {
		this.gumusMadalyaSayisi = gumusMadalyaSayisi;
	}

	public int getBronzMadalyaSayisi() {
		return bronzMadalyaSayisi;
	}

	public void setBronzMadalyaSayisi(int bronzMadalyaSayisi) {
		this.bronzMadalyaSayisi = bronzMadalyaSayisi;
	}

	public String toCSVString() {
		return Id + ";" + isim + ";" + soyad + "\r";
	}

	
	public String toString() {
		return getAdSoyad();
	}
}
