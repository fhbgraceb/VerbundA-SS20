package _glProg_MP_1;

/*
 * Eine Primzahl ist eine Zahl,
 * die nur durch 1 und durch sich selbst teilbar ist (2, 3, 5, 7, 11, ...).
 * 
 * Primzahlzwillinge sind zwei Primzahlen,
 * deren Wert sich um 2 unterscheidet (3 und 5, 5 und 7, 11 und 13, …).
 * 
 * Berechnen Sie wie viele dreistellige Primzahlzwillinge es gibt.
 */
public class Zwillinge 
{

	public static boolean istPrimzahl(int n)
	{
		boolean istPrimzahl;
		
		if (n == 1)
		{
			return false;
		}
		istPrimzahl = true;
		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)			// n durch i teilbar?
			{
				istPrimzahl = false;
			}
		}
		
		return istPrimzahl;
	}

	public static void main(String[] args) 
	{
		int anzahl = 0;
		final int von = 100;
		final int bis = 999;
		
		for (int n = von; n <= bis - 2; n++)
		{
			if (istPrimzahl(n) && istPrimzahl(n + 2))
			{
				anzahl++;
			}
		}
		
		System.out.printf("Von %d bis %d gibt es %d Primzahlzwillinge.\n",
							   von,   bis, 		 anzahl);
	}

}
