package einheit4;

import java.util.Scanner;

public class EinkaufenMitWhile {

	public static void main(String[] args) {

		// Einkaufen, Brot, Batterien, Banane, .....
		// ENDE
		// --> Sie haben n Produkt gekauft, ......Zeile, Sie haben .....

		String kassenzettel = ""; // Brot, Banane, ..
		Scanner scan = new Scanner(System.in);

		boolean einkaufenIsOn = true; // Code = ENDE

		while (einkaufenIsOn) {

			System.out.println("Was haben Sie gekauft?");
			String aktuellerArtikel = scan.nextLine();

			if (aktuellerArtikel.equalsIgnoreCase("ENDE")) {
				einkaufenIsOn = false;
			} else {
				kassenzettel = kassenzettel + ", " + aktuellerArtikel;
			}

		}
		
		System.out.println("Sie haben gekauft: " + kassenzettel);

	}

}
