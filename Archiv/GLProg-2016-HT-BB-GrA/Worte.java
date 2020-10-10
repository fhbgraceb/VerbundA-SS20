package _glProg_2016_HT_BB_GrA;

import java.util.Scanner;

public class Worte {

	/*
	* Lesen Sie die Anzahl der Zeilen und Spalten einer Matrix ein.
Erstellen Sie danach diese Matrix, füllen Sie diese mit Zufallszahlen von 1 bis 26 und geben Sie diese aus.
Erstellen Sie eine zweite Matrix, die so viele Elemente hat, wie die erste Matrix Zeilen, und befüllen Sie diese mit Strings,
* die Sie wie folgt aus der ersten Matrix erzeugen:
Jede Zeile der ersten Matrix ergibt ein Element der zweiten Matrix, indem die einzelnen Zahlen/Spalten
* durch den jeweiligen (Groß-)Buchstaben im Alphabet ersetzt und danach zusammengesetzt werden. (Sehen Sie dazu auch das Beispiel!)
Ein Beispiel für eine Matrix mit 4 Zeilen und 5 Spalten:
* Zufallszahlen:

3	1	26	5	4
10	18	8	7	19
13	3	12	7	2
23	17	23	13	16

 * Zufallsworte:

CAZED
JRHGS
MCLGB
WQWMP

Erklärung – ist vom Programm nicht auszugeben:
Das erste Wort lautet CAZED, weil
die erste Zeile der Zufallszahlen 3, 1, 26, 5, 4 ist und
C der 3., A der 1., Z der 26., E der 5.und D der 4. Buchstabe des Alphabets ist.
# buchstabe zahlen des alphabets
	* */

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int zeilen;
		int spalten;
		int[][] zahlen;
		String[] worte;
		String wort;
		
		System.out.print("Anzahl der Zeilen: ");
		zeilen = s.nextInt();
		System.out.print("Anzahl der Spalten: ");
		spalten = s.nextInt();
		zahlen = new int[zeilen][spalten];
		
		// Bef�llen und Ausgeben der Matrix erfolgt ein einem Schritt
		System.out.println("\n * Zufallszahlen:\n");

		for (int i = 0; i < zahlen.length; i++)
		{
			for (int j = 0; j < zahlen[i].length; j++)
			{
				zahlen[i][j] = (int)(Math.random() * (26 - 1 + 1) + 1);
				System.out.print(zahlen[i][j] + "\t");
			}
			System.out.println();
		}

		worte = new String[zeilen];
		for (int i = 0; i < zahlen.length; i++)
		{
			wort = "";
			for (int j = 0; j < zahlen[i].length; j++)
			{
				wort += (char)((int)'A' - 1 + zahlen[i][j]);
			}
			worte[i] = wort;
		}
				
		System.out.println("\n * Zufallsworte:\n");
		for (int i = 0; i < worte.length; i++)
		{
			System.out.println(worte[i]);
		}
		
		s.close();
	}

}
