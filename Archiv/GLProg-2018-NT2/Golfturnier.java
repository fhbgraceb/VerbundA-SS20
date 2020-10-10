package _glProg_2018_nt2_WORK;

import java.util.Scanner;

public class Golfturnier 
{
/*
* In Kürze wird in Golfturnier abgehalten.
Sie sind mit der technischen Lösung bzgl. Datenerfassung und Gewinnermittlung betraut worden.
Die Anzahl der TeilnehmerInnen ist noch nicht bekannt, gespielt wird auf einer Anlage mit 19 Bahnen.
Bevor das Spiel beginnt, wird zunächst die Anzahl der TeilnehmerInnen eingelesen, danach deren Namen.
Zunächst tritt der erste Spieler/die erste Spielerin an und spielt alle 19 Bahnen bis zum Ende.
Für jede Bahn wird die Anzahl der Schläge notiert, die benötigt wird, bis der Ball im Loch ist.
Wenn der/die erste SpielerIn fertig ist, beginnt der/die nächste SpielerIn, das Prozedere wiederholt sich
* bis alle SpielerInnen fertig gespielt haben.
Für jedeN der SpielerInnen muss auch berechnet werden, wie viele Schläge sie insgesamt (für alle 19 Bahnen) benötigt haben.
Der/Die SpielerIn mit der kleinsten Summe hat gewonnen, wobei es auch mehrere SiegerInnen geben kann.
Geben Sie abschließend die Namen der SiegerInnen aus.
Implementieren Sie ein Programm, mit dem das obige Spiel durchgeführt werden kann.

* */
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		final int bahnen = 3;
		int anzahlTeilnehmerInnen;
		int[][] punkte;
		String[] teilnehmerInnen;
		int[] summe;
		int minimum = Integer.MAX_VALUE;
		
		System.out.print("Anzahl der TeilnehmerInnen: ");
		anzahlTeilnehmerInnen = s.nextInt();
		punkte = new int[anzahlTeilnehmerInnen][bahnen];
		teilnehmerInnen = new String[anzahlTeilnehmerInnen];
		summe = new int[anzahlTeilnehmerInnen];
		
		s.nextLine();
		for (int i = 0; i < teilnehmerInnen.length; i++)
		{
			System.out.print("Name von TeilnehmerIn " + (i + 1) + ": ");
			teilnehmerInnen[i] = s.nextLine();
		}

		for (int sp = 0; sp < punkte.length; sp++)
		{
			System.out.println(teilnehmerInnen[sp]);
			for (int bahn = 0; bahn < punkte[sp].length; bahn++)
			{
				System.out.print("Punkte f�r Bahn " + (bahn + 1) + ": ");
				punkte[sp][bahn] = s.nextInt();
				summe[sp] += punkte[sp][bahn];
			}
			if (summe[sp] < minimum)
			{
				minimum = summe[sp];
			}
		}
		
		System.out.println("Punkteminimum: " + minimum);
		System.out.println("Gewonnen hat/haben:");
		for (int i = 0; i < punkte.length; i++)
		{
			if (summe[i] == minimum)
			{
				System.out.println(teilnehmerInnen[i]);
			}
		}
		
		s.close();
	}
}
