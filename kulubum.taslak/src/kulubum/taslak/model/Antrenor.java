package kulubum.taslak.model;

public class Antrenor extends Kisi {

	protected int antrenorlukKademesi;
	protected int danDerecesi;

	public int getDanDerecesi() {
		return danDerecesi;
	}

	public void setDanDerecesi(int danDerecesi) {
		this.danDerecesi = danDerecesi;
	}

	public int getAntrenorlukKademesi() {
		return antrenorlukKademesi;
	}

	public void setAntrenorlukKademesi(int antrenorlukKademesi) {
		this.antrenorlukKademesi = antrenorlukKademesi;
	}
}
