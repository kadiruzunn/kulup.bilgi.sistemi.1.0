package kulubum.taslak.sunum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Menu menu = new Menu();

		while (true) {
			menu.anaMenuGoster();

			int secilenMenuNo = sc.nextInt();

			menu.menuIslem(secilenMenuNo);

			System.out.println("XXXXXXXXXXXXXXXXXXXXXX");

		}

	}

}
