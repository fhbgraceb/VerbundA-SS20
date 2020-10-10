package aufgabe08;

/*
 * Kegeln: 
 * 
 * Bei einem Kegelturnier nehmen 47 Sportler teil, 
 * welche die Startnummern 101 bis 147 erhalten. 
 * Jeder der Teilnehmer hat 13 W�rfe auf die vollen Kegel, 
 * kann also jeweils 0 bis 9 Punkte erreichen. 
 * Simulieren Sie die W�rfe mit Zufallszahlen und speichern Sie 
 * die Werte in einem Array. 
 * Berechnen Sie danach f�r jeden Teilnehmer die Punktesumme und 
 * geben Sie die Startnummer des Turniersiegers (mit den meisten Punkten) aus.		
 */

public class Kegeln 
{

	public static void main(String[] args) 
	{
		final int anzahlRunden = 13;
		final int anzahlSpieler = 47;
		int[][] punkte = new int[anzahlSpieler][anzahlRunden];
		int offset = 101;					// Spieler Nr. 101 wird in Feld 0 gespeichert
											// Spieler Nr. 102 in Feld 1, ...
		int besteNr;
		int bestePunkte;
		int punkteSumme;
		
		/*
		 * gespielt wird Runde f�r Runde
		 */
		for (int runde = 0; runde < anzahlRunden; runde++)
		{
			System.out.println(" * Runde Nr. " + (runde + 1) + ":");
			for (int spieler = 0; spieler < anzahlSpieler; spieler++)
			{
				/*
				 * Beim Eintragen auf die Reihenfolge achten:
				 * Erst die Nummer des Spielers, dann die Nummer der Runde
				 */
				punkte[spieler][runde] = (int)(Math.random() * 9);	// vereinfacht von: Math.random() * (9 - 0 + 1) + 0
				/*
				 *  Ausgabe zur Kontrolle:
				 *  ausgegeben wird die tats�chliche Nummer des Spielers
				 */
				System.out.println("   Spieler Nr. " + (spieler + offset) + " wirft " + punkte[spieler][runde] + " Punkte");
			}
		}
		
		/*
		 * Nun kann ausgerechnet werden, wer gewonnen hat.
		 * Dabei wird Spieler f�r Spieler vorgegangen.
		 * Die H�chstpunkte und die Nummer des/der Besten wird immer gespeichert. 
		 */
		bestePunkte = 0;
		besteNr = 0;		// irgendein Wert
		for (int spieler = 0; spieler < anzahlSpieler; spieler++)
		{
			// F�r den neuen Spieler wieder bei 0 zu z�hlen beginnen.
			punkteSumme = 0;
			// Alle Punkte des Spielers zusammenz�hlen.
			for (int runde = 0; runde < anzahlRunden; runde++)
			{
				punkteSumme += punkte[spieler][runde];
			}
			// Wieder eine Ausgabe zur Kontrolle (mit der tats�chlichen Startnummer)
			System.out.println("Startnummer " + (spieler + offset) + " hat " + punkteSumme + " Punkte.");
			/* 
			 * Jetzt wird getestet, ob der neue Spieler besser ist als der bisherige beste.
			 */
			if (punkteSumme > bestePunkte)
			{
				/*
				 *  Eine neue Bestleistung!
				 *  Die neuen besten Punkte und die Nummer (genaugenommen den Index)
				 *  des zugeh�rigen Sportlers merken. 
				 */
				System.out.println(" ! Eine neue Bestleistung!!!");
				bestePunkte = punkteSumme;
				besteNr = spieler;				
			}
		}
		/*
		 * Jetzt ist der/die SiegerIn bekannt.
		 * Bei der Ausgabe muss jetzt wieder die StartNr ausgegeben werden.
		 */
		System.out.println(" *** Gewonnen hat Startnummer " + (besteNr + offset) + " mit " + bestePunkte + " Punkten.");
	}

}
