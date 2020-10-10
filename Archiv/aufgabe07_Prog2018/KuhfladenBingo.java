package aufgabe07;

/*
 * Kuhfladenbingo
 * 
 * Eine Weide wird in 10 mal 12 Felder unterteilt.
 * 
 * JedeR TeilnehmerIn sucht sich nun 3 der Felder aus. 
 * Dabei darf jedes Feld nur von einer Person ausgesucht werden.
 * 
 * Danach werden Kühe auf die Weide gelassen. 
 * Wenn eine Kuh einen Fladen fallen lässt
 * wird das Feld auf dem das passiert „abgehakt“.
 *  
 * SiegerIn des Spiels ist die Person, 
 * deren 3 Felder als erstes abgehakt wurden.
 * 
 * Erstellen Sie ein Programm, das dieses Spiel für 
 * Martin, Karin, Petra, Karim, Ronja, Patrick, Sabine und Pepe 
 * durchführt.
 * Sowohl die Auswahl der Felder, 
 * als auch das Verhalten der Kühe soll durch Zufallszahlen simuliert werden.
 * Geben Sie sowohl die Weide mit den Namen der Personen, 
 * die ein bestimmtes Feld gewählt haben, 
 * als auch den/die SiegerIn aus.
 */
public class KuhfladenBingo 
{
	
	/*
	 * Erzeugt ein Array mit den Felder der Weide und speichert (zufällig)
	 * wer welche Felder ausgesucht hat.
	 */
	public static String[][] feldAuswahl(int zeilen, int spalten, int anzFelder, String[] teilnehmerInnen)
	{
		String weide[][] = new String[zeilen][spalten];
		int zeile;
		int spalte;
		
		for (int i = 0; i < teilnehmerInnen.length; i++)
		{
			for (int auswahl = 1; auswahl <= anzFelder; auswahl++)
			{
				zeile = (int)(Math.random() * zeilen);
				spalte = (int)(Math.random() * spalten);
//				Vereinfacht von:
//				zeile = (int)(Math.random() * ((anzZeilen - 1) - 0 + 1) + 0);
//				spalte = (int)(Math.random() * ((anzSpalten - 1) - 0 + 1) + 0);
				
				// ist das gewählte Feld noch frei (niemand hat es ausgesucht)?
				if (weide[zeile][spalte] == null)
				{
					weide[zeile][spalte] = teilnehmerInnen[i];
				}
				else
				{
					auswahl--;
				}
			}
		}
		return weide;
	}
	
	/*
	 * Gibt aus welches Feld der Weide von wem belegt wurde
	 */
	public static void ausgabeWeide(String[][] weide)
	{
		System.out.println("\nDie Weide:\n");
		
		System.out.print("     ");
		for (int s = 0; s < weide[0].length; s++)
		{
			System.out.printf("%4d      ", s);
		}
		System.out.println();
		
		for (int z = 0; z < weide.length; z++)
		{
			System.out.printf("%2d : ", z);
			for (int s = 0; s < weide[z].length; s++)
			{
				if (weide[z][s] != null)
				{
					System.out.printf("%-9s ", weide[z][s]);
				}
				else
				{
					System.out.printf("%9s ", "");
				}
			}
			System.out.println();
		}
	}
	
	/*
	 * Das folgende Unterprogramm ist eine reine Spielerei.
	 * Es wird nur eine bestimmte Zeit gewartet.
	 */
	public static void waitMilliseconds(long ms)
	{		
		long time = System.currentTimeMillis() + ms;
		while (System.currentTimeMillis() <= time);
	}
	
	public static void main(String[] args) 
	{
		final int anzZeilen = 10;
		final int anzSpalten = 12;
		final int anzFelder = 3;
		String ausgesucht[][];
		boolean abgehakt[][] = new boolean[anzZeilen][anzSpalten];
		String[] teilnehmerInnen = new String[]{"Martin", "Karin", "Petra", "Karim", "Ronja", "Patrick", "Sabine", "Pepe"};
		int[] anzAbgehakt = new int[teilnehmerInnen.length];
		int zeile;
		int spalte;
		boolean fertig;
		String siegerIn = null;
		String feldBesitzer = null;
		int feldBesitzerNr = 0;
		
		// Auswahl der Felder
		ausgesucht = feldAuswahl(anzZeilen, anzSpalten, anzFelder, teilnehmerInnen);

		// Ausgabe der Auswahl der Felder
		ausgabeWeide(ausgesucht);
		
		// Aufmarsch der Kühe und gespanntes Warten was passiert ...
		System.out.println("\nDie Kühe betreten die Weide ...\n");
		fertig = false;
		do
		{
			/*
			 *  Hier ist eine Zeitverzögerung eingebaut 
			 *  um das Warten auf den nächsten Fladen zu simulieren ...
			 *  Es wird zwischen einer einer und fünf Sekunden gewartet.
			 */
			waitMilliseconds((long)(Math.random() * 4000 + 1000));
			
			// eine Kuh legt einen Fladen auf ein Feld
			zeile = (int)(Math.random() * anzZeilen);
			spalte = (int)(Math.random() * anzSpalten);
			System.out.printf("Ein Fladen wurde auf Feld %d, %d gelegt.\n", zeile, spalte);
			// Wenn dort noch kein Fladen war ...
			if (! abgehakt[zeile][spalte])
			{
				// ... Feld abhaken
				abgehakt[zeile][spalte] = true;
				System.out.println("Dort lag noch kein Fladen.");
				// Falls das Feld jemandem "gehört" ...
				if (ausgesucht[zeile][spalte] != null)
				{
					// (nachsehen, wem das Feld gehört)
					feldBesitzer = ausgesucht[zeile][spalte];
					System.out.println("Das ist ein Punkt für: " + feldBesitzer);
					// ... erst die Nummer der Person suchen ...
					for (int i = 0; i < teilnehmerInnen.length; i++)
					{
						if (teilnehmerInnen[i].equals(feldBesitzer))
						{
							feldBesitzerNr = i;
						}
					}
					// ... und das Feld für die Person mitzählen.
					anzAbgehakt[feldBesitzerNr]++;
					System.out.println(feldBesitzer + " hat schon " + anzAbgehakt[feldBesitzerNr] + " Felder abgehakt.");
				}
				else
				{
					System.out.println("Leider wollte niemand dieses Feld haben.");
				}
				// Wenn die Person damit alle Felder abgehakt hat ...
				if (anzAbgehakt[feldBesitzerNr] == anzFelder)
				{
					// .. ist das Spiel zu Ende ...
					fertig = true;
					// ... und die Person SiegerIn.
					siegerIn = feldBesitzer;
				}
			}
			else
			{
				System.out.println("Auf diesem Feld lag aber schon ein Fladen.");
			}
			
		} while (! fertig);
		
		// Ausgabe der SiegerIn
		System.out.println("\n *** Das Kuhfladenbingo wurde somit gewonnen von: " +  siegerIn);
	}

}
