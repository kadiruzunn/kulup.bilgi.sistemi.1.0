package kulubum.taslak.dal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import kulubum.taslak.model.Sporcu;


public class SporcuDAL {
	
	private final String SPORCU_VERILERI_DOSYA_ADI = "sporcular.csv";
	private List<Sporcu> sporcular;
	
	private static int idCounter = 0;
	
	public SporcuDAL() {
		sporcular = new ArrayList<>();
	}
	
	public List<Sporcu> liste() {

		try {

			File file = new File(SPORCU_VERILERI_DOSYA_ADI);
			Scanner myReader = new Scanner(file);

			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] arr = data.split(";");

				Sporcu o = new Sporcu();
				o.setId(Integer.valueOf(arr[0]));
				o.setIsim(arr[1]);
				o.setSoyad(arr[2]);

				sporcular.add(o);

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return sporcular;
	}
	
	public void ekle(Sporcu sporcu) {
		
		List<Sporcu> sporcuListesi = liste();
		
		if(sporcuListesi.size() == 0) {
			idCounter++;
		}else {
			Sporcu listedekiSonSporcu = sporcuListesi.get(sporcuListesi.size() - 1);
			int sonId = listedekiSonSporcu.getId();
			idCounter = sonId + 1;
		}
		
		sporcu.setId(idCounter);
		veriDosyasinaSporcuEkle(sporcu);
	}
	
	private void veriDosyasinaSporcuEkle(Sporcu sporcu) {
		try {
			FileWriter myWriter = new FileWriter("sporcular.csv", true);
			myWriter.write(sporcu.toCSVString());
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	private void tumVerileriSil() {

		try (FileWriter myWriter = new FileWriter("sporcular.csv")) {
			myWriter.write("");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public List<Sporcu> ara(String aranacakKelime) {
		
		List<Sporcu> tumSporcuListesi = liste();
		
		List<Sporcu> aramaSonucuSporcuListesi = new ArrayList<>();
		
		for (Sporcu sporcu : tumSporcuListesi) {
			
			aranacakKelime = aranacakKelime.toUpperCase();
			
			if (sporcu.getIsim().toUpperCase().contains(aranacakKelime) 
				|| sporcu.getSoyad().toUpperCase().contains(aranacakKelime)) {
				aramaSonucuSporcuListesi.add(sporcu);
				
			}
		}
		return aramaSonucuSporcuListesi;
	}
	
	
	
	public void sil(int silinecekSporcu) {
		
		List<Sporcu> tumSporcuListesi = liste();
		
		tumVerileriSil();
		
		for (Sporcu sporcu : tumSporcuListesi) {
			
			if (sporcu.getId() != silinecekSporcu) {
				veriDosyasinaSporcuEkle(sporcu);
			}
		}
	}

}
