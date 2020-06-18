package _glProg_2018_nt1;

public class Brettspiel 
{

	public static void main(String[] args) 
	{
		final int groesse = 6;
		int brett [][] = new int [groesse][groesse];
		String[] spielerInnen = new String[] {"", "Paul", "Marion", "Robert", "Gerda"};
		int counter [] = new int [spielerInnen.length];
		int besetzt = 0;
		int zeile = 0;
		int spalte = 0;

		while (besetzt < (groesse * groesse)) 
		{
			for (int i = 1; i < spielerInnen.length; i++) 
			{
				zeile = (int)(Math.random() * ((groesse - 1) - 0 + 1) + 0);
				spalte = (int)(Math.random() * ((groesse - 1) - 0 + 1) + 0);
				if (brett[zeile][spalte] == 0) 		// Feld ist frei
				{
					brett[zeile][spalte] = i;		// wird von der Person i besetzt
					besetzt++;
					counter[i]++;
				}
				else if (brett[zeile][spalte] == i) 	// Feld ist von der Person i selber besetzt
				{
					brett[zeile][spalte] = 0;				// wird wieder freigegeben
					besetzt--;					
					counter[i]--;
				}
			}
		}
		
		System.out.println("besetzte Felder:");
		for (int i = 1; i < spielerInnen.length; i++)
		{
			System.out.println(" * " + spielerInnen[i] + " : " + counter[i]);
		}
	}
}
