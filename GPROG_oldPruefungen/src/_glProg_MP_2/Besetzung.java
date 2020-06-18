package _glProg_MP_2;

/*
 * Nachdem bei diesem Spiel nur 2 Personen teilnehmen
 * wurde darauf verzichtet alle Daten (Namen, Anzahl, Augenzahl)
 * in Arrays zu speichern.
 * [Mit mehr als 2 SpielerInnen würde das Spiel (25 Felder, man braucht 12 für den Sieg)
 *  sehr wahrscheinlich nie enden.]
 */
public class Besetzung {
	
	public static void main(String[] args) 
	{
		final int groesse = 5;
		final int anzahlSieg = 12;
		final int offset = 1;			// Unterschied zwischen den Würfelaugen und der Arrayposition
		final int petraMarke = 1;		// Damit markiert Petra "ihre" Felder
		final int georgMarke = 2;
		int spielfeld[][] = new int[groesse][groesse];	// Es wäre auch ein String-Array möglich, in das die Namen geschrieben werden.
		int petraAnzahl = 0;			// Besetzte Felder
		int georgAnzahl = 0;
		int petraAugenZeile;			// Was wurde gewürfelt?
		int petraAugenSpalte;
		int georgAugenZeile;			// Nachdem in der Angabe steht, dass jedeR eigene
		int georgAugenSpalte;			// Würfel hat, ist dies auch hier so ;-)
		
		while ((petraAnzahl < anzahlSieg) && (georgAnzahl < anzahlSieg))
		{
			/*
			 *  Um gleich die richtige Position im Array zu bekommen wird
			 *  von den geworfenen Augen gleich 1 abgezogen.
			 *  
			 *  Genaugenommen könnte man gleich
			 *  	(int)(Math.random() * groesse)
			 *  schreiben, so ist aber der Bezug zur Formel und zur Angabe besser ersichtlich.
			 *  Intern wird der Ausdruck von Java sowieso dahingehend "optimiert".
			 */
			petraAugenZeile = (int)(Math.random() * (groesse - 1 + 1) + 1) - offset;
			petraAugenSpalte = (int)(Math.random() * (groesse - 1 + 1) + 1) - offset;
			georgAugenZeile = (int)(Math.random() * (groesse - 1 + 1) + 1) - offset;
			georgAugenSpalte = (int)(Math.random() * (groesse - 1 + 1) + 1) - offset;
			
			// Zuerst kommt Petra dran
			if (spielfeld[petraAugenZeile][petraAugenSpalte] == 0)		// Feld noch frei?
			{
				spielfeld[petraAugenZeile][petraAugenSpalte] = petraMarke;			// Petra besetzt das Feld ...
				petraAnzahl++;											// ... und hat ein Feld mehr
			} 
			else if (spielfeld[petraAugenZeile][petraAugenSpalte] == georgMarke)	// Georg hatte das Feld
			{
				spielfeld[petraAugenZeile][petraAugenSpalte] = petraMarke;			// Petra besetzt das Feld, ...
				petraAnzahl++;											// ... hat ein Feld mehr ...
				georgAnzahl--;											// ... und Georg hat nun ein Feld weniger.
			}			// Bei der 3. Möglichkeit - Petra hatte das Feld schon - ändert sich nichts, deshalb kein else
			
			// Danach kommt Georg dran, bei ihm läuft alles genau umgekehrt ab
			// Man könnte ihn auch mit denselben beiden Würfeln würfeln lassen.
			if (spielfeld[georgAugenZeile][georgAugenSpalte] == 0)
			{
				spielfeld[georgAugenZeile][georgAugenSpalte] = georgMarke;
				georgAnzahl++;
			} 
			else if (spielfeld[georgAugenZeile][georgAugenSpalte] == petraMarke)
			{
				spielfeld[georgAugenZeile][georgAugenSpalte] = georgMarke;
				georgAnzahl++;
				petraAnzahl--;						
			}
		}
		if (petraAnzahl > georgAnzahl)
		{
			System.out.println("Gewonnen hat Petra.");
		}
		else if (petraAnzahl < georgAnzahl)
		{
			System.out.println("Gewonnen hat Georg.");
		}
		else
		{
			System.out.println("Unentschieden.");
		}
		System.out.println("Petra: " + petraAnzahl);
		System.out.println("Georg: " + georgAnzahl);
	}

}
