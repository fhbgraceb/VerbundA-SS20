package _glProg_2016_HT_BB_GrA;

public class Summe 
{

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
		
		System.out.println("Ab dem " + anzahl + ". Glied ist die Summe der Reihe größer als " + grenze + ".");
	}

}
