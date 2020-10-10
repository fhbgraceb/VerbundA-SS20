package _glProg_MP_2;

public class Wettschiessen 
{
	/*
	Bei einem Wettschießen erhalten die TeilnehmerInnen für jeden Treffer einen Punkt.
Erstellen Sie das Unterprogramm ranking, an das ein Array mit den Punkten der TeilnehmerInnen übergeben wird und
das ein Array mit dem zu den jeweiligen Punkten gehörenden Ranking liefert. D.h.  die größte Zahl in der Liste erhält Rang 1,
die zweitgrößte Rang 2 u.s.w..
Das Ranking soll dann in main() ausgegeben werden.
Beachten Sie dabei, welchen Einfluss gleiche Punktezahlen auf das Ranking haben.
Beispiele:
An ranking übergebene Punkte:  [9, 3, 6, 19]
Ausgabe in main(): 2, 4, 3, 1
An ranking übergebene Punkte:  [3, 3, 3, 3, 3, 5, 1]
Ausgabe in main(): 2, 2, 2, 2, 2, 1, 7

	* */

	public static int[] ranking(int[] punkte) 
	{
		int[] ranking = new int[punkte.length];
		int rank;
		
		// F�r jede Person das Ranking berechnen und eintragen
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
