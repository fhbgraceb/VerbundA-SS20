package _glProg_2018_nt1_WORK;

import java.util.Scanner;

public class Lottotipps 
{

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
