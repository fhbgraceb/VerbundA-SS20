package _glProg_2016_NT2_GrA;

public class PunkteRanking 
{

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
			// Dann wird abgezählt, wie viele der andern Punkte besser sind
			besser = 0;
			for (int j = 0; j < punkte.length; j++)
			{
				if (punkte[j] > punkte[i])
				{
					besser++;
				}
			}
			// Der Platz, der den Punkten entspricht, ist um 1 größer, als die Anzahl der besseren
			// Ist nieman d besser, so hat man den 1. Platz
			// Vor dem 3. Platz liegen 2, die besser sind.
			platz = besser + 1;
			plaetze[i] = platz;
		}
		return plaetze;
	}
}
