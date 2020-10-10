package bspAusDemUnterricht;

public class BedingteAnweisung {

	public static void main(String[] args) {

		int punkte = -123;

		if ((punkte <= 100) && (punkte >0)) {

			// Bei den jeweiligen Abfragen gilt es die (absteigende) Ordnung zu beachten
			// was w¸rde passieren, wenn grˆﬂer 50 = x, grˆﬂer 60 = y, und Eingabe = 88
			
			if (punkte >= 90) {
				System.out.println("Gratulation zur ausgezeichnten Note");
			} else if (punkte >= 75) {
				System.out.println("Befriedigend");
			} else if (punkte >= 50) {
				System.out.println("Gerade noch");
			} else {
				System.out.println("Leider nein");
			}
		} else {
			System.out.println("Die Eingabepunktezahl war entweder groeﬂer 100 bzw. negativ");

		}

	}

}
