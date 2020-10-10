package _glProg_2018_BB_HT_WORK;

/*
 * Gegen�ber der Musterl�sung der Algorithmen-Pr�fung (2017 HT BB)
 * verschiebt sich alles was mit dem Array zu tun hat um 1,
 * Da die Indizes bei Java-Arrays bei 0 beginnen.
 */

/*
* Es gibt ein Spielfeld, welches aus 20 aneinandergereihten Feldern besteht.
* Dieses Spielfeld ist im Kreis angeordnet. Das bedeutet, dass nach dem Feld 20 wieder das Feld 1 folgt.
* Gespielt wird mit einem Kegel und einem üblichen Augen-Würfel (Wertebereich 1- 6). Der Kegel startet auf dem Feld 1.
* Dann wird gewürfelt. Die Augenzahl gibt an um wie viele Felder der Kegel weiterzieht.
* Von der neuen Position aus wird erneut gewürfelt und wieder die gewürfelte Augenzahl weitergezogen.
* Nachdem das Spielfeld rund ist fährt der Kegel immer im Kreis. (Steht der Kegel z.B. auf Feld 18 und es wird ein 5er gewürfelt,
* so kommt er auf Feld 3 zu stehen).
Das Spiel wird beendet, wenn eines der Felder zum 30. Mal besucht wird.
* Dabei wird das Hinstellen des Kegels auf Feld 1 (am Beginn des Spieles) als Besuch gewertet.
Schreiben Sie ein Programm, mit dem das obige Spiel durchgeführt wird.
* Dabei soll die gewürfelte Augenzahl jeweils zufällig bestimmt werden.
Am Ende soll ausgegeben werden, wie oft der Kegel das Spielfeld umrundet hat.

* */
public class Spiel 
{

	public static void main(String[] args) 
	{
		final int anzahlFelder = 20;
		final int besuchsZiel = 30;
		int[] spielfeld = new int[anzahlFelder];
		int runde;
		int wuerfel;
		boolean fertig;
		int position;
		
		for (int i = 0; i < spielfeld.length; i++)
		{
			spielfeld[i] = 0;
		}
		fertig = false;
		runde = 0;
		position = 0;
		spielfeld[position] = 1;
		while (! fertig)
		{
			wuerfel = (int)(Math.random() * (6 - 1 + 1) + 1);
			position += wuerfel;
			if (position >= spielfeld.length)
			{
				runde++;
				position = position % anzahlFelder;
			}
			spielfeld[position]++;
			if (spielfeld[position] >= besuchsZiel)
			{
				fertig = true;
			}
		}
		System.out.println("Der Kegel hat das Spielfeld " + runde + " Mal umrundet.");
	}

}
