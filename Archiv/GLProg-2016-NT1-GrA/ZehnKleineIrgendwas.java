package _glProg_2016_NT1_A;

public class ZehnKleineIrgendwas 
{
	/*
	* Sie haben ein rundes Spielfeld, welches aus 10 Feldern besteht. (Nach dem 10. Feld kommt wieder das 1. Feld).
	* Sie starten auf dem ersten Feld und würfeln mit einem normalen Würfel (Augenanzahl 1 bis 6).
	* Sie ziehen die gewürfelte Augenzahl weiter (und stehen somit auf einem neuen Feld). Wenn Sie 1.000 Mal würfeln,
	* welches Feld wurde am wenigsten besucht? Sollten mehrere Felder gleich wenig besucht werden, geben Sie nur eines davon aus.
Anmerkung: Das Startfeld (Feld 1) zählt bereits mit.

Die Ausgabe soll wie folgt aussehen:
Sie stehen auf Feld 1 und würfeln 3
Sie stehen auf Feld 4 und würfeln 5
Sie stehen auf Feld 9 und würfeln 2
Sie stehen auf Feld 1 und würfeln 6
Sie stehen auf Feld 7 und würfeln 1
…
Sie stehen auf Feld 4 und würfeln nicht mehr.
Feld 7 wurde nur 87 mal besucht

	* */

	public static void main(String[] args) 
	{
		final int felder = 10;
		final int anzahlRunden = 1000;
		int[] spielfeld = new int[felder];		// Wird als Z�hler benutzt
		int position = 1;
		int wuerfel;
		int minimum = 0;
		int minimumFeld;
		
		for (int runde = 1; runde <= anzahlRunden; runde++) 
		{
			wuerfel = (int)(Math.random() * (6 - 1 + 1) + 1);
			System.out.println("Sie stehen auf Feld " + position + " und w�rfeln " + wuerfel);
			position += wuerfel;
			if (position > spielfeld.length) 
			{
				position = position % spielfeld.length;
			}
			spielfeld[position - 1]++;
		}
		System.out.println("Sie stehen auf Feld " + position + " und w�rfeln nicht mehr.\n");		

		minimum = spielfeld[0];
		minimumFeld = 1;
		for (int feld = 1; feld < spielfeld.length; feld++) 
		{
			if (spielfeld[feld] < minimum) 
			{
				minimum = spielfeld[feld];
				minimumFeld = feld + 1;
			}
		}
		System.out.println("Feld " + minimumFeld + " wurde nur " + minimum + " mal besucht");
	}

}
