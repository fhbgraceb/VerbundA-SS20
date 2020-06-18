package _glProg_2018_nt2;

public class Spiel 
{
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
