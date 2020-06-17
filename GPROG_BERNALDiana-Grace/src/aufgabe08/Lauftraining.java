package aufgabe08;

/*
 * Lauftraining
 * Erstellen Sie ein 2-dimensionales Array, 
 * in dem die tägliche Laufleistung für ein Jahr gespeichert werden kann. 
 * Füllen Sie dieses Array mit Zufallszahlen von 0 bis 25.
 * 
 * Beachten Sie, dass die Monate verschieden viele Tage haben 
 * und passen Sie das Array dementsprechend an. 
 * Ignorieren Sie dabei, dass es auch Schaltjahre gibt.
 * 
 * Geben Sie dann die folgenden Informationen aus:
 *    * An welchem Tag (Monatsname und Tag) wurde die längste Strecke gelaufen?
 *    * Eine Statistik der Monate mit der in dem jeweiligen Monat gelaufenen Strecke.
 *    * Eine Statistik der Tage im Monat (1., 2., 3., …): 
 *      Wie weit wurde an diesen Tagen jeweils im Schnitt gelaufen?
 *    * An welchen 5 aufeinander folgenden Tagen wurde in Summe die geringste Strecke zurückgelegt?
 */

public class Lauftraining 
{

	public static void main(String[] args) 
	{
		final double maximalDistanz = 25;
		String[] monate = new String[]{"Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
		int tageImMonat[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		/*
		 * Zunächst einmal Platz für die Monate schaffen.
		 * double wird verwendet um beliebige Distanzen speichern zu können
		 */
		double[][] laufleistung = new double[monate.length][];
		double tagesMaximum;
		double[] monatsLeistung = new double[monate.length];
		
		// Dann für die entsprechende Anzahl an Tagen im Monat Platz schaffen
		for (int i = 0; i < tageImMonat.length; i++)
		{
			laufleistung[i] = new double[tageImMonat[i]];
		}
		
		/*
		 *  Jetzt die Laufleistung eintragen
		 *  Dabei wird auf 10 Meter gerundet (Fleissaufgabe des Programnmierers)
		 */
		for (int monat = 0; monat < laufleistung.length; monat++)
		{
			for (int tag = 0; tag < tageImMonat[monat]; tag++)
			{
				// Zunächst die Strecke in Metern berechnen
				int strecke = (int)(Math.random() * ((maximalDistanz * 1000) - 0 + 1));
				// Auf 10 Meter runden
				strecke = strecke / 10 * 10;
				// In km umrechnen (aufpassen auf double!) und im Array eintragen
				laufleistung[monat][tag] = strecke / 1000.0;
			}
		}

		// Ausgabe der Laufleistung
		System.out.printf("%-12s : ", "Monat");
		for (int i = 1; i <= 31; i++)
		{
			System.out.printf(" %2d.  ", i);
		}
		System.out.println();
		for (int monat = 0; monat < laufleistung.length; monat++)
		{
			System.out.printf("%-12s : ", monate[monat]);
			for (int tag = 0; tag < tageImMonat[monat]; tag++)
			{
				System.out.printf("%5.2f ", laufleistung[monat][tag]);
			}
			System.out.println();
		}
		
		/*
		 * Es kann mehrere Tage mit derselben Laufleistung geben.
		 * Deshalb erfolgt die Berechnung in zwei Schritten:
		 * 
		 * 1. Berechnung der maximalen Laufleistung
		 * 2. Ausgabe derjenigen Tage, an denen diese Strecke gelaufen wurde 
		 */
		tagesMaximum = 0;
		for (int monat = 0; monat < laufleistung.length; monat++)
		{
			for (int tag = 0; tag < tageImMonat[monat]; tag++)
			{
				if (laufleistung[monat][tag] > tagesMaximum)
				{
					tagesMaximum = laufleistung[monat][tag];
				}
			}
		}
		System.out.println();
		System.out.println("Tagesmaximum ist: " + tagesMaximum);
		System.out.println("Es wurde gelaufen an den folgenden Tagen:");
		for (int monat = 0; monat < laufleistung.length; monat++)
		{
			for (int tag = 0; tag < tageImMonat[monat]; tag++)
			{
				if (laufleistung[monat][tag] == tagesMaximum)
				{
					System.out.println(tag + 1 + ". " + monate[monat]);
				}
			}
		}
		System.out.println();
		
		// Monatsleistung berechnen
		System.out.println("Die Laufleistung der einzelnen Monate:");
		for (int monat = 0; monat < laufleistung.length; monat++)
		{
			double summe = 0;
			for (int tag = 0; tag < tageImMonat[monat]; tag++)
			{
				summe += laufleistung[monat][tag];
			}
			monatsLeistung[monat] = summe;
			System.out.printf("%-12s : %5.2f\n", monate[monat], monatsLeistung[monat]);
		}
		
		/*
		 *  Tagesleistung berechnen
		 *  Dazu alle möglichen Tage durchgehen
		 */
		System.out.println();
		System.out.println("Wie weit wurde an den Tagen im Schnitt gelaufen?");
		for (int tag = 0; tag <= 30; tag++)
		{
			double summe = 0;
			int anzahl = 0;
			// Nun alle Monate durchgehen
			for (int monat = 0; monat < laufleistung.length; monat++)
			{
				/*
				 *  Achtung: Gibt es den Tag im Monat?
				 *  Im Februar gibt es nur 28 Tage, im April nur 30, ... 
				 */
				if (tag < tageImMonat[monat])
				{
					summe += laufleistung[monat][tag];
					anzahl++;
				}
			}
			System.out.printf("%2d. (%2d Tage): %5.2f\n", tag + 1, anzahl, summe / anzahl);
		}
		
		/*
		 * TODO Erweiterung auf ex aequoe Leistungen (in mehreren Perioden wurde gleich viel gelaufen) - 
		 *      derzeit wird nur die erste solche Periode ausgegeben.
		 * Idee: 
		 * Die Schleife verdoppeln (wie oben beim Tagesmaximum): 
		 *   * einmal min. Distanz berechnen, 
		 *   * beim zweiten Mal Perioden mit dieser Distanz ausgeben
		 */
		/*
		 * Strecke an 5 aufeinander folgenden Tagen
		 * Idee:
		 * In einem Array speichern welches die aktuellen Tage sind (Nummer von Monat und Tag)
		 * Summe verwalten
		 * Jeweils einen Tag weggeben und einen neuen dazu nehmen.
		 * Wenn die Summe kleiner als das Minimum ist die entsprchenden Eckdaten (von, bis für Tag und Monat) merken. 
		 */
		/*
		 *  Nachdem die folgenden Variablen nur für diese Aufagbe benötigt werden,
		 *  werden Sie hier definiert.
		 *  Für ein Unterprogramm müsste man zu viele Arrays übergeben (Monatsnamen, ...)
		 */
		final int anzahlTage = 5;		// Länge der Periode
		double minimaleStrecke = maximalDistanz * anzahlTage;		// minimale Distanz - muss auf einen großen Wert gesetzt werden
		double aktuelleStrecke = 0;		// Distanz der aktullen Periode
		int minVonTag = 0;				// Beginn und Ende der Periode mit minimalem Wert
		int minVonMonat = 0;
		int minBisTag = 0;
		int minBisMonat = 0;
		int[] inSummeTag = new int[anzahlTage];		// Welche Tage sind bei der aktuellen Periode dabei
		int[] inSummeMonat = new int[anzahlTage];
		int index = 0;								// welcher Tag der Periode wird "ausgetauscht"
		int soVieleDa = 0;				// Wie viel Tage sind schon in der Summe enthalten?
		boolean alleDa = false;			// Sind schon 5 Tage in der Summe enthalten?
		for (int monat = 0; monat < laufleistung.length; monat++)
		{
			for (int tag = 0; tag < tageImMonat[monat]; tag++)
			{
				if (alleDa)
				{
					aktuelleStrecke -= laufleistung[inSummeMonat[index]][inSummeTag[index]];
				}
				else
				{
					soVieleDa++;
					if (soVieleDa == anzahlTage)
					{
						alleDa = true;
					}
				}
				aktuelleStrecke += laufleistung[monat][tag];
				inSummeTag[index] = tag;
				inSummeMonat[index] = monat;
				if (alleDa)
				{
					if (aktuelleStrecke < minimaleStrecke)
					{
						minimaleStrecke = aktuelleStrecke;
						minBisTag = tag;
						minBisMonat = monat;
						if (index < anzahlTage - 1)
						{
							minVonTag = inSummeTag[index + 1];
							minVonMonat = inSummeMonat[index + 1];
						}
						else
						{
							minVonTag = inSummeTag[0];
							minVonMonat = inSummeMonat[0];
						}
					}
				}
				index++;
				if (index >= anzahlTage)
				{
					index = 0;
				}
			}
		}
		System.out.println();
		System.out.printf("Die minimale Laufleistung an %d aufeinander folgenden Tagen beträgt: %6.2f\n", 
													anzahlTage, 							minimaleStrecke);
		System.out.printf("Sie wurde gelaufen vom %d. %s bis zum %d. %s.\n", 
					minVonTag + 1, monate[minVonMonat], minBisTag + 1, monate[minBisMonat]);

	}

}
