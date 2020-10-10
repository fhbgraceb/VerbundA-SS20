package aufgabe06_Prog2018;

import java.util.Scanner;

/*
 * Eratosthenes: 
 * 
 * Bestimmen Sie alle Primzahlen bis zu einem gegebenen n
 * mit Hilfe des „Siebs des Eratosthenes“.
 * 
 * Bei diesem Sieb werden alle Zahlen aufgeschrieben.
 * Danach werden zuerst alle Vielfachen von 2 gestrichen (keine Primzahlen).
 * Dann werden alle Vielfachen von 3 gestrichen, 
 * dann die Vielfachen von 4, ...
 *  
 * Die Zahlen, die zum Schluss übrig bleiben sind die Primzahlen.
 */
public class Eratothenes 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int anzahlZahlen;
		/*
		 * Im Array wird für jede Zahl gespeichert
		 * ob sie gestrichen ist oder nicht:
		 *    true ...  Zahl ist nicht gestrichen, es gibt sie noch
		 *    false ... Zahl ist gestrichen
		 */
		boolean[] zahlen;
		
		System.out.print("Bis zu welcher Zahl sollen die Primzahlen bestimmt werden? ");
		anzahlZahlen = s.nextInt();
		zahlen = new boolean[anzahlZahlen + 1];		// Weil Arrays bei 0 beginnen
		
		// Am anfang sind die Zahlen nicht gestrichen
		for (int i = 2; i <= anzahlZahlen; i++)
		{
			zahlen[i] = true;
		}
		
		/*
		 * Nun werden die Zahlen gestrichen.
		 * Begonnen wird mit den Vielfachen von 2.
		 */
		for (int n = 2; n <= anzahlZahlen; n++)
		{
			// n ist möglicherweise Primzahl und wird nicht gestrichen
			for (int streichen = 2 * n; streichen <= anzahlZahlen; streichen += n)
			{
				System.out.println("Gestrichen wird: " + streichen + " (Vielfaches von: " + n + ")");
				zahlen[streichen] = false;
			}
		}
		
		System.out.println("Die Primzahlen bis " + anzahlZahlen + " sind:");
		for (int i = 2; i < anzahlZahlen; i++)
		{
			if (zahlen[i])		// Zahl ist nicht gestrichen
			{
				System.out.print(i + " ");
			}
		}
		
		s.close();
	}

}
