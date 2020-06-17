package _glProg_MP_1;

/*
 * Auf einem Tisch stehen in einer 6x6 Matrix angeordnet Schachteln mit jeweils 3 Pralinen. 
 * 4 FreundInnen  (Jasmin, Michi, Andi und Joe) würfeln nun reihum mit zwei Würfeln, 
 * wobei der erste Würfel die Zeile der zweite Würfel die Spalte der Matrix angibt. 
 * Falls sich in der entsprechenden Schachtel noch Pralinen befinden, darf die Person eine davon essen.
 * 
 * Sobald alle Schachteln leer sind ist das Spiel beendet.
 * 
 * Simulieren Sie dieses Spiel und geben Sie anschließend aus wie viele Pralinen jede der FreundInnen gegessen hat.
 */

public class Pralinen 
{

	public static void main(String[] args) 
	{
		final int groesse = 6;
		final int inhaltAnfang = 3;
		int[][] schachteln = new int[groesse][groesse];
		int volleSchachteln = groesse * groesse;		// in wie vielen Schachteln ist noch etwas drinnen?
		int wurfelt;
		String personen[] = new String[]{"Jasmin", "Michi", "Andi", "Joe"};		// mitspielende Personen
		int[] anzahl = new int[personen.length];		// anzahl der gegessenen Pralinen
		int zeile;
		int spalte;
		
		
		for (int i = 0; i < schachteln.length; i++)
		{
			for (int j = 0; j < schachteln[i].length; j++)
			{
				schachteln[i][j] = inhaltAnfang;
			}
		}
		
		wurfelt = 0;		// Die erste Person kommt dran
		while (volleSchachteln > 0)
		{
			zeile = (int)(Math.random() * ((groesse - 1) - 0 + 1) + 0);
			spalte = (int)(Math.random() * ((groesse - 1) - 0 + 1) + 0);
			if (schachteln[zeile][spalte] > 0)
			{
				schachteln[zeile][spalte]--;		// Praline aus der Schachtel nehmen
				anzahl[wurfelt]++;					// und von der Person, die dran ist gegessen
				if (schachteln[zeile][spalte] == 0)
				{
					volleSchachteln--;
				}
			}
			wurfelt = (wurfelt + 1) % personen.length;	// dann kommt die nächste Person dran
		}
		
		System.out.println("Anzahl der gegessenen Pralinen:");
		for (int i = 0; i < personen.length; i++)
		{
			System.out.printf(" * %-10s : %3d Pralinen\n", personen[i], anzahl[i]);
		}
	}

}
