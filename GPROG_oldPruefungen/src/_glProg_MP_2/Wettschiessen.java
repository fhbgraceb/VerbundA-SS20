package _glProg_MP_2;

public class Wettschiessen 
{

	public static int[] ranking(int[] punkte) 
	{
		int[] ranking = new int[punkte.length];
		int rank;
		
		// Für jede Person das Ranking berechnen und eintragen
		for (int i = 0; i < punkte.length; i++) 
		{
			// Der Rank einer Person ist die Anzahl der Leute,
			// die mehr Punkte haben plus 1 (Niemand ist besser als der/die 1.)
			rank = 1;
			for (int j = 0; j < punkte.length; j++) 
			{
				if (punkte[j] > punkte[i]) 
				{
					rank++;
				}
			}
			ranking[i] = rank;
		}
		return ranking;
	}
	
	public static void main(String[] args) 
	{
		int[] punkte1 = new int[]{9, 3, 6, 19};
		int[] ranking1 = ranking(punkte1);
		
		for (int i = 0; i < ranking1.length; i++) 
		{
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(ranking1[i]);
		}
		System.out.println();
		
		int[] punkte2 = new int[]{3, 3, 3, 3, 3, 5, 1};
		int[] ranking2 = ranking(punkte2);
		
		for (int i = 0; i < ranking2.length; i++) 
		{
			if (i > 0) 
			{
				System.out.print(", ");
			}
			System.out.print(ranking2[i]);
		}
		System.out.println();
	}

}
