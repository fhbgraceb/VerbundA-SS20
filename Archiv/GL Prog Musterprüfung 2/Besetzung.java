package _glProg_MP_2;
/*
Petra und Georg spielen auf einem quadratischen Spielbrett mit 25 Feldern (5 Zeilen, 5 Spalten) folgendes Spiel:
Am Anfang des Spiels sind noch alle Felder frei.
Die beiden haben jeweils 2 spezielle Würfel, die fünf Seiten mit den Augenzahlen von 1 bis 5 haben.
Petra würfelt mit ihrem ersten Würfel die Nummer einer Zeile und mit ihrem zweiten Würfel die Nummer einer Spalte.
Das so gewürfelte Feld wird von ihr besetzt. Falls das gewürfelte Feld bereits von Georg besetzt war,
so hat es nun eine neue Besitzerin – und Georg verliert das Feld.
Danach würfelt Georg und verfährt dabei analog.
Gewonnen hat, wer von den beiden zuerst 12 Felder im Besitz hat. Gewertet wird aber immer erst,
wenn eine Runde abgeschlossen wurde, also kann das Spiel auch unentschieden ausgehen.
Geben Sie aus, wer gewonnen hat und je Spieler die Anzahl der besetzten Felder.
Die Ausgabe könnte etwa so aussehen:
Petra: 12
Georg: 12
Das Spiel endet unentschieden
#spiel array array2d
* */
/*
 * Nachdem bei diesem Spiel nur 2 Personen teilnehmen
 * wurde darauf verzichtet alle Daten (Namen, Anzahl, Augenzahl)
 * in Arrays zu speichern.
 * [Mit mehr als 2 SpielerInnen w�rde das Spiel (25 Felder, man braucht 12 f�r den Sieg)
 *  sehr wahrscheinlich nie enden.]
 */
public class Besetzung {
	
	public static void main(String[] args) 
	{
		final int groesse = 5;
		final int anzahlSieg = 12;
		final int offset = 1;			// Unterschied zwischen den W�rfelaugen und der Arrayposition
		final int petraMarke = 1;		// Damit markiert Petra "ihre" Felder
		final int georgMarke = 2;
		int spielfeld[][] = new int[groesse][groesse];	// Es w�re auch ein String-Array m�glich, in das die Namen geschrieben werden.
		int petraAnzahl = 0;			// Besetzte Felder
		int georgAnzahl = 0;
		int petraAugenZeile;			// Was wurde gew�rfelt?
		int petraAugenSpalte;
		int georgAugenZeile;			// Nachdem in der Angabe steht, dass jedeR eigene
		int georgAugenSpalte;			// W�rfel hat, ist dies auch hier so ;-)
		
		while ((petraAnzahl < anzahlSieg) && (georgAnzahl < anzahlSieg))
		{
			/*
			 *  Um gleich die richtige Position im Array zu bekommen wird
			 *  von den geworfenen Augen gleich 1 abgezogen.
			 *  
			 *  Genaugenommen k�nnte man gleich
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
			}			// Bei der 3. M�glichkeit - Petra hatte das Feld schon - �ndert sich nichts, deshalb kein else
			
			// Danach kommt Georg dran, bei ihm l�uft alles genau umgekehrt ab
			// Man k�nnte ihn auch mit denselben beiden W�rfeln w�rfeln lassen.
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
