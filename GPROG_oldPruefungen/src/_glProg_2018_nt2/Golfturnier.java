package _glProg_2018_nt2;

import java.util.Scanner;

public class Golfturnier 
{

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
				System.out.print("Punkte für Bahn " + (bahn + 1) + ": ");
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
