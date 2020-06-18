package einheit4;

import java.util.concurrent.ThreadLocalRandom;

public class WuerfelMitReihe {

	public static void main(String[] args) {

		int versuche = 0;

		boolean nichtGefunden = true;
		int sechserCoutner = 0;

		while (nichtGefunden) {
			int zufallszahl = ThreadLocalRandom.current().nextInt(1, 6 + 1);
			versuche = versuche + 1;

			if (zufallszahl == 6) {
				sechserCoutner++;
				// versuche++;

				if (sechserCoutner == 3) {
					nichtGefunden = false;
				}
			}else {
				sechserCoutner = 0;
			}

			// System.out.println(zufallszahl);
		}

		System.out.println("Sie haben benötigt " + versuche + " Versuche");
		System.out.println(sechserCoutner);

	}

}
