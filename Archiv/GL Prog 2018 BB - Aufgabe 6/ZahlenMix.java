package aufgabe06;

/*
 * Beispielgruppe 5 - eindimensionale Arrays
 * 
 * ZahlenMix
 * 
 * Generieren Sie ein Array mit 10 verschiedenen Zufallszahlen von 65 bis 90. 
 * Stellen Sie dabei sicher, dass keine der Zahlen doppelt vorkommt.
 * 
 * Anmerkung:
 * Es wird in jedes Feld des Arrays eine Zahl eingetragen.
 * Vor dem Eintragen einer weiteren Zahl wird überprüft,
 * ob die Zahl schon einmal eingetragen worden ist.
 * Falls ja, wird eine neue Zufallszahl erzeugt,
 * was solnage wiederholt wird, so lange die Zahl nicht neu ist.
 */

public class ZahlenMix 
{

	public static void main(String[] args) 
	{
		final int anzahlZahlen = 10;
		final int minZahl = 65;
		final int maxZahl = 90;
		int[] zahlen = new int[anzahlZahlen];
		boolean zahlIstNeu;
		int zahl;

		// Alle Plaätze im Array befüllen
		for (int freierPlatz = 0; freierPlatz < zahlen.length; freierPlatz++)
		{
			do
			{
				// Zahl erzeugen
				zahl = (int)(Math.random() * (maxZahl - minZahl + 1) + minZahl);
				zahlIstNeu = true;
				// Mit den Zahlen vergleichen, die bereits im Array stehen
				for (int belegterPlatz = 0; belegterPlatz < freierPlatz; belegterPlatz++)
				{
					if (zahl == zahlen[belegterPlatz])		// Wenn es die Zahl dort schon gibt ...
					{
						zahlIstNeu = false;					// ... dann st sie nicht neu ...
					}
				}
			} while (! zahlIstNeu);				// ... und es muss eine neue Zahl erzeugt werden.
			zahlen[freierPlatz] = zahl;			// Wenn die Zahl neu ist, wird sie eingetragen
		}
		
		for (int i = 0; i < zahlen.length; i++)
		{
			System.out.println(zahlen[i]);
		}
	}

}
