package _glProg_2016_NT2_GrA;

public class Buchstaben 
{

	/*
	Schreiben Sie ein Unterprogramm buchstaben, an das zwei Zahlen übergeben werden. Die beiden Zahlen
	geben die Anzahl der Zeilen und Spalten eines Arrays an. Füllen Sie das Array mit zufällig
	erzeugten Großbuchstaben (von ‘A‘ bis ‘Z‘) und geben Sie es, wie unten angeführt (mit Beistrichen und Punkten), aus.
Stellen Sie dann für jeden Buchstaben fest, in welcher Zeile (Zählung nach Java, also bei 0 beginnend) er am häufigsten vorkommt.
Sollte ein Buchstabe in mehreren Zeilen am häufigsten vorkommen, können Sie eine beliebige davon nehmen.
Sollte ein Buchstabe gar nicht vorkommen, nehmen Sie als Zeilennummer -1.
Addieren Sie alle diese Zeilennummern und liefern Sie die Summe als Ergebnis zurück.
Ein Beispiel:
Übergabe:	3, 4
Ausgabe in der Console:
B, C, B, A.
C, B, A, C.
A, B, A, B.
Rückgabe: 	-18
Erklärung (muss nicht ausgegeben werden):
A kommt in Zeile 2 am häufigsten vor.
B kommt in den Zeilen  0 und 2 am häufigsten vor, gewählt wird letztere, also Zeile 2.
C kommt in Zeile 1 am häufigsten vor.
Die anderen 23 Buchstaben kommen gar nicht vor. Für jeden dieser Buchstaben wird als Zeilennummer -1 genommen.
Als Summe ergibt sich also -18.

	* */

	public static void main(String[] args) 
	{
		System.out.println(buchstaben(3, 4));
		System.out.println(buchstaben(5, 7));
	}

	public static int buchstaben(int zeilen, int spalten)
	{
		int summe = 0;
		char[][] buchstaben = new char[zeilen][spalten];
		int anzahl;
		int maximum;
		int besteZeile;
		
		// Im folgenden wird das Array bef�llt und auch gleich ausgegeben.
		for (int zeile = 0; zeile < buchstaben.length; zeile++)
		{
			for (int spalte = 0; spalte < buchstaben[zeile].length; spalte++)
			{
				buchstaben[zeile][spalte] = (char)(int)(Math.random() * ((int)'Z' - (int)'A' + 1) + (int)'A');
				System.out.print(buchstaben[zeile][spalte]);
				if (spalte < buchstaben[zeile].length - 1)
				{
					System.out.print(", ");
				}
				else
				{
					System.out.print(".");
				}
			}
			System.out.println();
		}
		
		// Nun wird f�r jeden Buchstaben nachgesehen, in welcher Zeile er am h�ufigsten vorkommt.
		for (char c = 'A'; c <= 'Z'; c++)
		{
			maximum = 0;
			besteZeile = -1;
			for (int zeile = 0; zeile < buchstaben.length; zeile++)
			{
				anzahl = 0;
				for (int spalte = 0; spalte < buchstaben[zeile].length; spalte++)
				{
					if (buchstaben[zeile][spalte] == c)
					{
						anzahl++;
					}
				}
				if (anzahl > maximum)
				{
					maximum = anzahl;
					besteZeile = zeile;
				}
			}
			summe += besteZeile;
			System.out.println(c + " : " + summe);
		}
		
		return summe;
	}
}
