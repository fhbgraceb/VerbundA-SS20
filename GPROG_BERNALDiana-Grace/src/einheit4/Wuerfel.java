package einheit4;

import java.util.concurrent.ThreadLocalRandom;

public class Wuerfel {

	public static void main(String[] args) {

		int versuche = 0;

		boolean nichtGefunden = true;

		while (nichtGefunden) {
			int zufallszahl = ThreadLocalRandom.current().nextInt(1, 6 + 1);
			versuche = versuche + 1;

			if (zufallszahl == 6) {
				nichtGefunden = false;
				// versuche++;
			}
			//System.out.println(zufallszahl);
		}

		System.out.println("Sie haben benötigt " + versuche + " Versuche");

	}

}
