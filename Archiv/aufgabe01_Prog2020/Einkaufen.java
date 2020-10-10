package aufgabe01;

import java.util.Scanner;

public class Einkaufen {

	public static void main(String[] args) {

		// dieses BSP ist lediglich nice-to-have

		// Sie gehen Einkaufen, und werden an der Kassa gefragt, wieviel Stück Sie von
		// einem Produkt gekauft haben
		// und den jeweiligen Preis des Artikels, nachdem alle Artikel eintragen
		// wurden(die Anzahl ist beliebig, 2 genügen)
		// Werden Sie abschließend über den Zahlbetrag informiert und "übergeben" das
		// Geld, darauf wird Ihnen das
		// Retourgeld angezeigt.
		// Eine Lösung könnte so aussehen

		// Wurst 1 x 4.20 EUR
		// 4.20 EUR
		// Käse 1 x 2.30 EUR
		// 2.30 EUR
		// Brot 1 x 2.10 EUR
		// 2.10 EUR
		// DVD 2 x 12.00 EUR
		// 24.00 EUR
		// ----------------------------------
		// Gesamt 32.60 EUR
		// Gegeben 50.00 EUR
		//
		// Zurück 17.40 EUR

		Scanner scan = new Scanner(System.in);

		System.out.println("Welches Produkt moechten sie denn kaufen?");
		String Produkt1 = scan.next();

		System.out.println("Wieviel sind Sie denn bereit zu zahlen?");
		double preis1 = scan.nextDouble();

		System.out.println("Wieviel Stueck moechten Sie denn erwerben?");
		int stueck1 = scan.nextInt();

		System.out.println(Produkt1 + " " + preis1 + " EUR" + " x " + stueck1);

		System.out.println("Welches Produkt moechten sie denn kaufen?");
		String produkt1 = scan.next();

		System.out.println("Wieviel sind Sie denn bereit zu zahlen?");
		double preis2 = scan.nextDouble();

		System.out.println("Wieviel Stueck moechten Sie denn erwerben?");
		int stueck2 = scan.nextInt();

		System.out.println(Produkt1 + " " + preis1 + " EUR" + " x " + stueck2);

		double oldZW1 = preis1 * stueck2;
		double ZW1 = Math.round(oldZW1 * 100) / 100.00;
		System.out.println("Zwischensumme:" + ZW1 + " EUR");

		System.out.println(produkt1 + " " + preis2 + " EUR" + " x " + stueck2);
		double oldZW2 = preis2 * stueck2;

		double ZW2 = Math.round(oldZW2 * 100) / 100.00;

		System.out.println("Zwischensumme:" + ZW2 + " EUR");
		System.out.println("----------------");

		double oldGesamt = (preis1 * stueck1) + (preis2 * stueck2);
		double Gesamt = Math.round(oldGesamt * 100) / 100.00;

		System.out.println("Gesamt:" + Gesamt + " Eur");
		System.out.println("Bitte begleichen sie die Rechnung");

		double Gegeben = scan.nextDouble();
		double oldRest = Gegeben - Gesamt;
		double Rest = Math.round(oldRest * 100) / 100.00;

		System.out.println("Rest  :" + Rest + " EUR");

		System.out.println("*** Programm beendet ***");

		scan.close();

	}

}
