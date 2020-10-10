package _glProg_2016_HT_BB_GrA;

import java.util.Scanner;

public class Worte {

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
		
		// Befüllen und Ausgeben der Matrix erfolgt ein einem Schritt
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
