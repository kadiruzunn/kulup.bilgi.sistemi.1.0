package kulubum.taslak.sunum;

public enum MenuSecim {
	LİSTELE(1),
	ARA(2),
	EKLE(3),
	GUNCELLE(4),
	SIL(5);
	
private int value;
	
	MenuSecim(int value) {
		this.value = value;
	}

	
	public int getValue() {
		return value;
	}
	
	
}
