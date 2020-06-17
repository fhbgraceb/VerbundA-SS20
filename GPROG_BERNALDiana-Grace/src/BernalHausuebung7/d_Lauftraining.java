package BernalHausuebung7;

public class d_Lauftraining {
	/*
	 * Erstellen Sie ein 2-dimensionales Array, in dem die tägliche Laufleistung für
	 * ein Jahr gespeichert werden kann. Füllen Sie dieses Array mit Zufallszahlen
	 * von 0 bis 25. Beachten Sie, dass die Monate verschieden viele Tage haben und
	 * passen Sie das Array dementsprechend an. Ignorieren Sie dabei, dass es auch
	 * Schaltjahre gibt. Geben Sie dann die folgenden Informationen aus: - An
	 * welchem Tag (Monatsname und Tag) wurde die längste Strecke gelaufen? - Eine
	 * Statistik der Monate mit der in dem jeweiligen Monat gelaufenen Strecke. -
	 * Eine Statistik der Tage im Monat (1., 2., 3., …): - Wie weit wurde an diesen
	 * Tagen jeweils im Schnitt gelaufen? - An welchen 5 aufeinander folgenden Tagen
	 * wurde in Summe die geringste Strecke zurückgelegt?
	 */

	public static void main(String[] args) {
		final double maximalDistanz = 25;
		String[] monate = new String[] { "Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec." };
		int tageImMonat[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		double[][] laufLeistung = new double[monate.length][];
		double tageMax;
		double[] monatsLeistung = new double[monate.length];

		for (int i = 0; i < tageImMonat.length; i++) {
			laufLeistung[i] = new double[tageImMonat[i]];
		}

		for (int monat = 0; monat < laufLeistung.length; monat++) {
			for (int tag = 0; tag < tageImMonat[monat]; tag++) {
				int strecke = (int) (Math.random() * ((maximalDistanz * 1000) - 0 + 1)); //meter runden
				strecke = strecke / 10 * 10; //km
				laufLeistung[monat][tag] = strecke / 1000.0;
			}
		}

		// Ausgabe der Laufleistung
		System.out.printf("%-12s : ", "Monat");
		for (int i = 1; i <= 31; i++) {
			System.out.printf(" %2d.  ", i);
		}
		System.out.println();
		for (int monat = 0; monat < laufLeistung.length; monat++) {
			System.out.printf("%-12s : ", monate[monat]);
			for (int tag = 0; tag < tageImMonat[monat]; tag++) {
				System.out.printf("%5.2f ", laufLeistung[monat][tag]);
			}
			System.out.println();
		}

		/*
		 * 1. maximalen Laufleistung 
		 * 2. Ausgabe derjenigen Tage, an denen diese gelaufen wurde
		 */
		tageMax = 0;
		for (int monat = 0; monat < laufLeistung.length; monat++) {
			for (int tag = 0; tag < tageImMonat[monat]; tag++) {
				if (laufLeistung[monat][tag] > tageMax) {
					tageMax = laufLeistung[monat][tag];
				}
			}
		}
		System.out.println();
		System.out.println("Tages Maximum: " + tageMax);
		System.out.println("An den folgenden Tagen wurde gelaufen:");
		for (int monat = 0; monat < laufLeistung.length; monat++) {
			for (int tag = 0; tag < tageImMonat[monat]; tag++) {
				if (laufLeistung[monat][tag] == tageMax) {
					System.out.println(tag + 1 + ". " + monate[monat]);
				}
			}
		}
		System.out.println();

		/*----------------------------------------Monatsleistung----------------------------------------*/
		System.out.println("Laufleistung der Monate:");
		for (int monat = 0; monat < laufLeistung.length; monat++) {
			double summe = 0;
			for (int tag = 0; tag < tageImMonat[monat]; tag++) {
				summe += laufLeistung[monat][tag];
			}
			monatsLeistung[monat] = summe;
			System.out.printf("%-12s : %5.2f\n", monate[monat], monatsLeistung[monat]);
		}

		/*----------------------------------------Tage durchgehen----------------------------------------*/
		System.out.println();
		System.out.println("Wie weit wurde an den Tagen im Schnitt gelaufen?");
		for (int tag = 0; tag <= 30; tag++) {
			double summe = 0;
			int anzahl = 0;
			/*----------------------------------------Monate durchgehen----------------------------------------*/
			for (int monat = 0; monat < laufLeistung.length; monat++) {
				/*-gibt es es den Tag im Monat (ungleich)-*/
				if (tag < tageImMonat[monat]) {
					summe += laufLeistung[monat][tag];
					anzahl++;
				}
			}
			System.out.printf("%2d. (%2d Tage): %5.2f\n", tag + 1, anzahl, summe / anzahl);
		}

		final int anzahlTage = 5; //Periode
		double minStrecke = maximalDistanz * anzahlTage; 
		double aktStrecke = 0; // distanz der aktullen Periode
		int minVonTag = 0; 
		int minVonMonat = 0;
		int minBisTag = 0;
		int minBisMonat = 0;
		int[] sumTag = new int[anzahlTage]; 
		int[] sumMonat = new int[anzahlTage];
		int index = 0; 
		int soVieleDa = 0;
		boolean alleDa = false; // schon 5 Tage in Summe?
		for (int monat = 0; monat < laufLeistung.length; monat++) {
			for (int tag = 0; tag < tageImMonat[monat]; tag++) {
				if (alleDa) {
					aktStrecke -= laufLeistung[sumMonat[index]][sumTag[index]];
				} else {
					soVieleDa++;
					if (soVieleDa == anzahlTage) {
						alleDa = true;
					}
				}
				aktStrecke += laufLeistung[monat][tag];
				sumTag[index] = tag;
				sumMonat[index] = monat;
				if (alleDa) {
					if (aktStrecke < minStrecke) {
						minStrecke = aktStrecke;
						minBisTag = tag;
						minBisMonat = monat;
						if (index < anzahlTage - 1) {
							minVonTag = sumTag[index + 1];
							minVonMonat = sumMonat[index + 1];
						} else {
							minVonTag = sumTag[0];
							minVonMonat = sumMonat[0];
						}
					}
				}
				index++;
				if (index >= anzahlTage) {
					index = 0;
				}
			}
		}
		System.out.println();
		System.out.printf("minimale Laufleistung an %d aufeinander folgenden Tagen ist: %6.2f\n", anzahlTage, minStrecke);
		System.out.printf("diese wurde gelaufen vom %d. %s bis zum %d. %s", minVonTag + 1, monate[minVonMonat], minBisTag + 1, monate[minBisMonat]);
	}
}