package _glProg_2018_nt2_WORK;

public class Spiel 
{
	/*
	* Karli, Tommy und Fredi spielen auf einem quadratischen Spielfeld mit 100 Feldern.
Jedes Feld bedeutet eine bestimmte Punktezahl: beginnend links oben stehen in der ersten Zeile Punkte von 1 bis 10,
* die Felder in der zweiten Zeile haben Punkte von 11 bis 20, usw.
Jeder der Spieler würfelt mit 2 Würfeln, einer steht dabei für die Zeile, der andere für die Spalte des Feldes.
Wenn das Feld noch nie besucht wurde, erhält der Spieler die auf dem Feld verzeichneten Punkte, ansonsten nichts.
Karli beginnt, die Spieler würfeln reihum und jeder der Spieler kommt insgesamt 50 Mal dran.
Geben Sie aus, wie viele Punkte jeder der Spieler bekommen hat.

	* */
	public static void main(String[] args) 
	{
		final int groesse = 10;
		final int runden = 50;
		int[][] feld = new int[groesse][groesse];
		String teilnehmerInnen[] = new String[]{"Karli", "Tommy", "Fredi"};
		int[] punkte = new int[teilnehmerInnen.length];
		int zeile; 
		int spalte;	
		
		for (int z = 0; z < feld.length; z++)
		{
			for (int s = 0; s < feld[z].length; s++)
			{
				feld [z][s] = 10 * z + (s + 1);
			}
		}
		
		for (int n = 1; n <= runden; n++) 
		{
			for (int i = 0; i < teilnehmerInnen.length; i++)
			{
				zeile = (int) (Math.random() * ((groesse - 1) - 0 + 1) + 0);
				spalte = (int) (Math.random() * ((groesse - 1) - 0 + 1) + 0);
				punkte[i] += feld[zeile][spalte];
				feld[zeile][spalte] = 0;
			}
		}

		for (int i = 0; i < teilnehmerInnen.length; i++)
		{
			System.out.printf("Punkte von %s: %d\n", teilnehmerInnen[i], punkte[i]);
		}
	}

}
