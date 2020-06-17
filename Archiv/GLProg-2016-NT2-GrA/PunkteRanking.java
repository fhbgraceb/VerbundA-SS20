package _glProg_2016_NT2_GrA;

public class PunkteRanking 
{

	/*
	Erstellen Sie ein Unterprogramm ranking, an das beliebig viel ganze Zahlen (die Punkte) übergeben werden.
Sie können davon ausgehen, dass nur Zahlen von 0 bis 100 im Array stehen, die alle unterschiedlich sind.
Als Ergebnis liefert das Unterprogramm ein weiteres Array mit der jeweiligen Platzierung, die den Punkten im Ranking entspricht.
Je mehr Punkte, desto weiter vorne ist man im Ranking.
Ein Beispiel :
Übergabe: 	77, 33, 55, 99
Rückgabe:	2, 4, 3, 1
Erklärung (muss nicht ausgegeben werden):
Mit 77 Punkten ist man an der 2. Stelle, mit 33 an der 4., mit 55 an der 3. Und mit 99 ist man 1.

	* */

	public static void main(String[] args) 
	{
		int[] rank = ranking(new int[]{77, 33, 55, 99});
		for (int i = 0; i < rank.length; i++)
		{
			if (i != 0)
			{
				System.out.print(", ");
			}
			System.out.print(rank[i]);
		}
	}

	public static int[] ranking(int[] punkte) 
	{
		int[] plaetze = new int[punkte.length];
		int besser;
		int platz;
		
		// Eine Punktezahl nach der anderen wird angesehen
		for (int i = 0; i < punkte.length; i++)
		{
			// Dann wird abgez�hlt, wie viele der andern Punkte besser sind
			besser = 0;
			for (int j = 0; j < punkte.length; j++)
			{
				if (punkte[j] > punkte[i])
				{
					besser++;
				}
			}
			// Der Platz, der den Punkten entspricht, ist um 1 gr��er, als die Anzahl der besseren
			// Ist nieman d besser, so hat man den 1. Platz
			// Vor dem 3. Platz liegen 2, die besser sind.
			platz = besser + 1;
			plaetze[i] = platz;
		}
		return plaetze;
	}
}
