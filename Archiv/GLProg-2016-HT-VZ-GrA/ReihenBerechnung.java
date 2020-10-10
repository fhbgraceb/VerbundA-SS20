package _glProh_2016_HT_VZ_GrA;

public class ReihenBerechnung 
{

	/*
	ReihenBerechnung (14 Punkte)
Berechnen Sie die Summe der ersten 12345 Glieder folgender Reihe und geben Sie das Ergebnis aus.
-3/1 - 4/2 - 5/3 + 6/4 +7/5 + 8/6 - 9/7 - 10/8 - 11/9 + ……
	* */

	public static void main(String[] args) 
	{
		double summe;
		double glied;
		boolean addieren = false;
		
		summe = 0;
		for (double i = 1; i <= 12345; i++)
		{
			glied = (i + 2) / i;
			if (addieren)
			{
				summe += glied;
			}
			else
			{
				summe -= glied;
			}
			// Nach jedem 3. Glied �ndert sich das Vorzeichen
			if (i % 3 == 0)
			{
				addieren = ! addieren;
			}
		}
		System.out.println(summe);
	}

}
