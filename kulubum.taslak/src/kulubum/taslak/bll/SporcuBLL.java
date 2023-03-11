package kulubum.taslak.bll;

import java.util.List;
import kulubum.taslak.dal.SporcuDAL;
import kulubum.taslak.model.Sporcu;

public class SporcuBLL {
	
	private SporcuDAL dal;
	
	public List<Sporcu> liste() {
		dal = new SporcuDAL();
		return dal.liste();
	}
	public void ekle(Sporcu sporcu) {
		dal = new SporcuDAL();
		dal.ekle(sporcu);
	}
	
	public List<Sporcu> ara(String aranacakKelime) {
		
		dal = new SporcuDAL();
		return dal.ara(aranacakKelime);
	}
	
	public void sil(int silinecekSporcuId) {
		
		dal = new SporcuDAL();
		dal.sil(silinecekSporcuId);
	}

}
