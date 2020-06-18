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
 * 
 * In dieser Version sind ein paar Optimierungen eingebaut.
 */
public class EratothenesOptimiert 
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
		int n;			// Die Vielfachen von n werden gestrichen
		int streichen;	// Diese Zahlen werden gestrichen
		
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
		n = 2;
		while (n <= anzahlZahlen)
		{
			/*
			 * Die Zahl n ist Primzahl und wird nicht gestrichen.
			 * Die "kleinen" Vielfachen einer Zahl wurden auch bereits gestrichen,
			 * man kann beim Quadrat der Zahl anfangen zu streichen.
			 * 
			 * 2 * 5 wurde bei 2 gestrichen
			 * 3 * 5 wurde bei 3 gestrichen
			 * 4 * 5 wurde bei 4 gestrichen 
			 * 5 * 5 wurd noch nicht gestrichen
			 * 
			 * Aus diesem Grund läuft die Schleife auch nur so lange n * n
			 * kleiner als die Anzahl der Zahlen ist, danach bit es nichts 
			 * mehr zu streichen.
			 */
			for (streichen = n * n; streichen <= anzahlZahlen; streichen += n)
			{
//				System.out.println("Gestrichen wird: " + streichen + " (Vielfaches von: " + n + ")");
				zahlen[streichen] = false;
			}
			/*
			 * Falls eine Zahl bereits gestrichen ist, 
			 * so sind auch ihre Vielfachen schon gestrichen.
			 * (Die Vielfachen von 4 sind auch Vielfache von 2 und wurden
			 *  bei deren Vielfachen gestrichen). 
			 * Man kann sie also übergehen um das Programm zu beschleunigen).
			 * Die folgende Schleife sucht die nächste zu streichende Zahl:
			 */
			do
			{
				n++;				
			}
			while ((n <= anzahlZahlen) && (! zahlen[n]));
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
