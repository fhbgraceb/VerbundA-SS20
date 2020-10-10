package _glProg_2018_nt1_WORK;

import java.util.Scanner;

public class Lottotipps 
{
/*
* Schreiben Sie ein Programm, dass eine bestimmte Anzahl an korrekten Lottotipps erzeugen kann.
Lesen Sie dazu zunächst ein, wie viele Lottotipps erzeugt werden sollen.
Erstellen Sie danach ein passendes Array und befüllen Sie dieses mit passenden Zufallszahlen,
* welche die Lottotipps bilden und geben Sie diese auch aus.
Ein korrekter Lottotipp besteht aus 6 unterschiedlichen Zahlen von 1 bis 45.
Bei der Eingabe von 3 könnte die Ausgabe so aussehen:
33 17 42 6 22 31
3 9 41 27 17 25
42 34 12 1 13 28

* */
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		final int zahlen = 6;
		final int min = 1;
		final int max = 45;
		int tipps[][];
		int anzahl;
		int zahl = 0;
		int wert;
		boolean ok;

		do
		{
			System.out.print("Wie viele Tipps wollen Sie spielen? ");
			anzahl = s.nextInt();
		} while (! (anzahl > 0));
		
		tipps = new int[anzahl][zahlen];
		for (int tipp = 0; tipp < tipps.length; tipp++)
		{
			zahl = 0;
			do
			{
				ok = true;
				wert = (int)(Math.random() * (max - min + 1) + min);
				for (int i = 0; i < zahl; i ++)
				{
					if (tipps[tipp][i] == wert)
					{
						ok = false;
					}
				}
				if (ok)
				{
					tipps[tipp][zahl] = wert;
					zahl++;
				}
			} while (zahl < zahlen);
		}
		
		System.out.println("Ihre Tipps:");
		for (int tipp = 0; tipp < tipps.length; tipp++)
		{
			for (int i = 0; i < tipps[tipp].length; i++)
			{
				System.out.print(tipps[tipp][i] + " ");
			}
			System.out.println();
		}
		s.close();
	}

}
