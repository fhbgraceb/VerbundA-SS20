package _glProg_2016_HT_BB_GrA;

public class Summe 
{
/*
Ab dem wievielten Glied ist die (Summe der) folgenden Reihe größer als 1234?
1/4 + 1/5 + 1/6 + 7/2 + 8/2 + 9/2 + 3/10 + 3/11 + 3/12 + 13/4 …
# reihe glied summe
* */
	public static void main(String[] args) 
	{
		final int grenze = 1234;
		double summe = 0;
		double glied;
		int anzahl = 0;
		double zahl1 = 1;
		double zahl2 = 4;
		
		
		while (summe <= grenze)
		{
			anzahl++;
			if ((anzahl % 6 == 1) || (anzahl % 6 == 2) || (anzahl % 6 == 3))
			{
				glied = zahl1 / zahl2;
			}
			else
			{
				glied = zahl2 / zahl1;
			}
			zahl2++;
			if (anzahl % 3 == 0)
			{
				zahl1++;
			}
			summe += glied;
		}
		
		System.out.println("Ab dem " + anzahl + ". Glied ist die Summe der Reihe gr��er als " + grenze + ".");
	}

}
