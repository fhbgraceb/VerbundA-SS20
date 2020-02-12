package aufgabe09;

/*
 * zweitlaengsteStrings: 
 * 
 * Schreiben Sie ein Unterprogramm an das 
 * eine beliebige Anzahl von Strings �bergeben werden kann und 
 * das die Strings mit der zweitgr��ten L�nge zur�ckliefert
 * (dies k�nnen auch mehrere sein).
 * 
 * Beispiel:
 * zweitlaengsteStrings("ABCD", "ABCDE", "QWER", "QWERT")
 * liefert als Ergebnis ein Array mit den Elementen �ABCD� und �QWER�, 
 * weil das die Strings mit der zweitgr��ten L�nge (4) sind.
 *
 * Die L�sung basiert auf einer Idee von Herrn Auer (PIT-Student, 2012).
 */
public class ZweitlaengsteStrings 
{

	public static String[] zweitlaengsteStrings(String[] worte)
	{
		String[] ergebnis;
		int laenge = 0;
		int laengste = 0;
		int zweitlaengste = 0;
		int anzahl;
		int position;
		
		// zweitgr��te L�nge suchen
		for (int i = 0; i < worte.length; i++)
		{
			laenge = worte[i].length();
			if (laenge > laengste)
			{
				zweitlaengste = laengste;
				laengste = laenge;
			} 
			else if ((laenge < laengste) && (laenge > zweitlaengste))
			{
				zweitlaengste = laenge;
			}
		}
		
		// Anzahl der Strings mit der zweitgr��ten L�nge suchen
		anzahl = 0;
		for (int i = 0; i < worte.length; i++)
		{
			if (worte[i].length() == zweitlaengste)
			{
				anzahl++;
			}
		}
		
		// Das Ergebnis-Array auf die richtige Gr��e bringen
		ergebnis = new String[anzahl];
		
		// Die zweitl�ngsten Strings in das Array einf�llen
		position = 0;
		for (int i = 0; i < worte.length; i++)
		{
			if (worte[i].length() == zweitlaengste)
			{
				ergebnis[position] = worte[i];
				position++;
			}
		}

		return ergebnis;
	}
	
	public static void main(String[] args) 
	{
		String[][] daten;
		String[] ergebnis;

		// Testdaten:
		daten = new String[][]{{"ABCD", "ABCDE", "QWER", "QWERTY"},				// "ABCDE"
							   {"ABCD", "ABCDE", "QWER", "QWERT", "ABCDEF"},	// "ABCDE" und "QWERT"
							   {"ASDF", "QWER", "YXCV"}};						// Alle gleich lang - kein zweitl�ngstes - keine Ausgabe

		for (int i = 0; i < daten.length; i++)
		{
			for (int j = 0; j < daten[i].length; j++)
			{
				System.out.print(daten[i][j] + " ");
			}
			System.out.println(":");
			
			ergebnis = zweitlaengsteStrings(daten[i]);
			for (int j = 0; j < ergebnis.length; j++)
			{
				System.out.print(ergebnis[j] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}

}
