package aufgabe05;

import java.util.Scanner;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * NhochN:
 * 
 * Lesen Sie eine Zahl (n) ein und berechnen Sie:
 * 
 *   n
 * Summe i^i
 *  i=1
 *
 * (also 
 * 		1^1+2^2+3^3+ ... +n^n
 *  oder
 *  	1 + 2 * 2 + 3 * 3 * 3 + ... + n * n * ... * n)
 *
 * ohne die Potenzfunktion zu benutzen.
 */
public class NHochNUP 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		long n;
		
		System.out.println(" *** n hoch n ***");
		System.out.print("Bitte n eingeben: ");
		n = s.nextLong();
				
		System.out.println("Die Summe n hoch n betr‰gt: " + nHochN(n));
	}

	public static long nHochN(long n)
	{
		long summe;
		long produkt;

		summe = 0;
		/*
		 * In der ‰uﬂeren Schleife wertden die Produkte aufsummiert. 
		 */
		for (int i = 1; i <= n; i++)
		{
			/* 
			 * In der inneren Schleife werden die Produkte gebildet.
			 * 
			 * Also 1, 2*2, 3*3*3, ...
			 */
			produkt = 1;
			for (int j = 1; j <= i; j++)
			{
				produkt *= i;
			}
			summe += produkt;
			// Zur Kontrolle:
//			System.out.println("i: " + i + " Produkt: " + produkt + " Summe: " + summe);
		}
		
		return summe;
	}
}
