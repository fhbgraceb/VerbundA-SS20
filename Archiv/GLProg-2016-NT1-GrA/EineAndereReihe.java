package _glProg_2016_NT1_A;

public class EineAndereReihe 
{
	/*
	Berechnen Sie das  500. Glied folgender Reihe und geben Sie es aus:
	1/2 + 2/3 - 3/4 - 4/5 - 5/6 + 6/7 + 7/8 - 8/9 - 9/10 - 10/11 + 11/12 + 12/13 - 13/14 -   ….

	* */

	public static void main(String[] args) 
	{
		final int anzahlGlieder = 500;
		double summe = 0;
		double glied;
		
		for (double i = 1; i <= anzahlGlieder; i++) 
		{
			glied = i / (i + 1);
			if ((i % 5 == 1) || (i % 5 == 2)) 
			{
				summe += glied;
			} 
			else 
			{
				summe -= glied;
			}
		}
		
		System.out.println(summe);
	}

}
