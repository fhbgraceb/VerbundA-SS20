package BernalHausuebung7;

import java.util.Scanner;

public class b_LottoAuswertung {

	/*
	 * Lesen Sie bis zu 50 Lottotipps ein, stellen Sie dabei sicher, dass in einem
	 * Tipp keine doppelten Zahlen und nur solche von 1 bis 45 eingegeben werden.
	 * Simulieren Sie dann mittels Zufallszahlen die Ziehung ohne Zusatzzahl (auch
	 * hier dürfen keine doppelten vorkommen). Geben Sie abschließend für jeden Tipp
	 * die Anzahl der richtigen Zahlen aus und ob er gewonnen hat (3, 4, 5 oder 6
	 * Richtige; die Zusatzzahl zählt nicht) oder nicht.
	 */

	public static boolean ueberpruef(int[] zahlen, int anzahl, int zahl) {
		boolean vorhanden = false;

		if (anzahl > zahlen.length) {
			anzahl = zahlen.length;
		}

		for (int i = 0; i < anzahl; i++) {
			if (zahlen[i] == zahl) {
				vorhanden = true;
			}
		}
		return vorhanden;
	}

	public static void ausgabe(int[] zahlen) {
		for (int number = 0; number < zahlen.length; number++) {
			if (number > 0) {
				System.out.print(", ");
			}
			System.out.printf("%2d", zahlen[number]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		final int maxAnzahlTipps = 50;
		final int anzahlZahlen = 6;
		final int maxZahl = 45;
		final int minZahl = 1;
		final int minRichtige = 3;

		int tipps[][] = new int[maxAnzahlTipps][anzahlZahlen];
		int ziehung[] = new int[anzahlZahlen];

		int anzahlTipps = 0;
		boolean weiterEinlesen = true;
		int zahl = 0;
		int anzahlRichtige;

		System.out.println();
		System.out.println("Die Tipp-Abgabe:");
		do {
			for (int zahlNr = 0; zahlNr < anzahlZahlen; zahlNr++) {
				System.out.printf("Bitte die %d. Zahl von Tipp %2d eingeben: ", zahlNr + 1, anzahlTipps + 1);
				zahl = s.nextInt();
				if (zahl < minZahl || zahl > maxZahl || ueberpruef(tipps[anzahlTipps], anzahlZahlen, zahl)) {
					System.out.println("Falsche Eingabe!");
					zahlNr--;
				} else {
					tipps[anzahlTipps][zahlNr] = zahl;
				}
			}
			anzahlTipps++;
			if (anzahlTipps >= maxAnzahlTipps) {
				weiterEinlesen = false;
			} else {
				System.out.print("Wollen Sie noch einen weiteren Tipp abgeben (\"J\" für JA)? ");
				if (!s.next().equalsIgnoreCase("J")) {
					weiterEinlesen = false;
				}
			}
		} while (weiterEinlesen);

		// abgegebene Tipps
		System.out.println();
		System.out.println("Die Auswertung:");
		for (int tippNr = 0; tippNr < anzahlTipps; tippNr++) {
			System.out.printf("Tipp Nr. %2d: ", tippNr + 1);
			ausgabe(tipps[tippNr]);
		}

		// Ziehung
		for (int zahlNr = 0; zahlNr < anzahlZahlen; zahlNr++) {
			zahl = (int) (Math.random() * (maxZahl - minZahl + 1) + minZahl);
			if (ueberpruef(ziehung, zahlNr, zahl)) {
				zahlNr--;
			} else {
				ziehung[zahlNr] = zahl;
			}
		}

		System.out.println();
		System.out.println("Die Ziehung:");
		ausgabe(ziehung);

		// Auswerten
		System.out.println();
		System.out.println("Die Auswertung:");
		for (int tippNr = 0; tippNr < anzahlTipps; tippNr++) {
			anzahlRichtige = 0;
			for (int tippZahlNr = 0; tippZahlNr < anzahlZahlen; tippZahlNr++) {
				for (int ziehungZahlNr = 0; ziehungZahlNr < anzahlZahlen; ziehungZahlNr++) {
					if (tipps[tippNr][tippZahlNr] == ziehung[ziehungZahlNr]) {
						anzahlRichtige++;
					}
				}
			}
			System.out.printf("Tipp Nr. %2d: %1d Richtige", tippNr, anzahlRichtige);
			if (anzahlRichtige >= minRichtige) {
				System.out.print(" - GEWONNEN!!!");
			}
			System.out.println();
		}

		s.close();
	}

}
