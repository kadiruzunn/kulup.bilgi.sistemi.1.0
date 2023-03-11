package kulubum.taslak.sunum;

import java.util.List;
import java.util.Scanner;
import kulubum.taslak.bll.SporcuBLL;
import kulubum.taslak.model.Sporcu;

public class Menu {

	private SporcuBLL bll;

	public void anaMenuGoster() {
		System.out.println("--------KULUBUM---------");
		System.out.println("------------------------");
		System.out.println("|   1-Sporcu Listesi   |");
		System.out.println("|   2-Sporcu Ara       |");
		System.out.println("|   3-Sporcu Ekle      |");
		System.out.println("|   4-Sporcu Guncelle  |");
		System.out.println("|   5-Sporcu Sil       |");
		System.out.println("------------------------");
		System.out.print(" YAPMAK ISTEDIGINIZ IS ICIN NUMARA GIRINIZ :");
	}

	private String araMenusu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ARAMAK İSTEDİĞİNİZ KELİMEYİ GİRİNİZ : ");

		String aranacakKelime = sc.next();

		return aranacakKelime;
	}

	private Sporcu ekleMenusu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nAdınız :");
		String isim = sc.nextLine();

		Sporcu sporcu = new Sporcu();
		sporcu.setId(1);
		sporcu.setIsim(isim);

		System.out.println("Soyadınız :");
		String soyad = sc.nextLine();
		sporcu.setSoyad(soyad);

		return sporcu;

	}

	public void menuIslem(int secilenMenuNo) {

		if (secilenMenuNo == MenuSecim.LİSTELE.getValue()) {
			liste();
		} else if (secilenMenuNo == MenuSecim.EKLE.getValue()) {
			Sporcu yeniSporcu = ekleMenusu();
			ekle(yeniSporcu);
			System.out.println("YENİ SPORCU BAŞARIYLA EKLENDI");
			liste();
		} else if (secilenMenuNo == MenuSecim.ARA.getValue()) {
			String aranacakKelime = araMenusu();
			ara(aranacakKelime);
		} else if (secilenMenuNo == MenuSecim.SIL.getValue()) {
			liste();
			sil();
			liste();
		}

	}

	private void sil() {
		System.out.println("SİLMEK İSTEDİGİNİZ SPORCUNUN ID SİNİ YAZIN : ");
		Scanner scanner = new Scanner(System.in);
		int silinecekOgrenciId = scanner.nextInt();

		bll = new SporcuBLL();
		bll.sil(silinecekOgrenciId);
	}

	private void ara(String aranacakKelime) {
		bll = new SporcuBLL();
		List<Sporcu> sonucListesi = bll.ara(aranacakKelime);
		liste(sonucListesi);
	}

	private void ekle(Sporcu sporcu) {
		bll = new SporcuBLL();

		bll.ekle(sporcu);
	}

	private void liste() {

		bll = new SporcuBLL();
		List<Sporcu> liste = bll.liste();

		System.out.println("---SPORCU LİSTESİ---");
		System.out.println("--------------------");
		System.out.println("Id\tİsim\tSoyad");
		System.out.println("--\t--\t\t-----");

		for (Sporcu sporcu : liste) {

			System.out.printf("%d\t%s\t\t%s\n", sporcu.getId(), sporcu.getIsim(), sporcu.getSoyad());

		}

	}

	private void liste(List<Sporcu> sporcuListesi) {
		System.out.println("---SPORCU LİSTESİ---");
		System.out.println("--------------------");
		System.out.println("Id\tİsim\tSoyad");
		System.out.println("--\t--\t\t-----");

		for (Sporcu sporcu : sporcuListesi) {

			System.out.printf("%d\t%s\t\t%s\n", sporcu.getId(), sporcu.getIsim(), sporcu.getSoyad());
		}
	}


}
