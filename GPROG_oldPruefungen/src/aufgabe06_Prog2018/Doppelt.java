package aufgabe06_Prog2018;

import java.util.Scanner;

/*
 * Doppelt: 
 * 
 * Lesen Sie 10 Zahlen in ein Array ein und 
 * stellen Sie fest ob eine Zahl doppelt im Array vorkommt.
 */
public class Doppelt 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		final int anzahlZahlen = 10;		// Um die Anzahl leicht ändern zu könnne
		int[] zahlen = new int[anzahlZahlen];
		boolean doppelt;
		
		for (int i = 0; i < anzahlZahlen; i++)
		{
			System.out.print("Bitte geben Sie die " + (i + 1) + ". Zahl (von " + anzahlZahlen + ") ein: ");
			zahlen[i] = s.nextInt();
		}
		
		/*
		 * Zuerst vergleich man die erste Zahl mit allen anderen,
		 * danach die zweite, dann die dritte, ...
		 * 
		 * Man muss darauf achten, dass man eine Zahl nicht mit sich selbst vergleicht.
		 * Um die Sache zu beschleunigen, muss man zwei Zahlen auch nicht
		 * doppelt miteinander vergleichen, also die erste mit der zweiten
		 * und dann die zweite mit der ersten. D.h. dass eine Zahl nur mit
		 * denen verglichen wird, die hinter ihr im Array liegen.
		 */
		doppelt = false;
		// Eine Zahl hernehmen
		for (int i = 0; i < anzahlZahlen; i++)
		{
			// Und mit denen hinter ihr im Array vergleichen
			for (int j = i+ 1; j < anzahlZahlen; j++)
			{
				if (zahlen[i] == zahlen[j])
				{
					doppelt = true;
				}
			}
		}
		
		if (doppelt)
		{
			System.out.println("Es kommen Zahlen doppelt im Array vor.");
		}
		else
		{
			System.out.println("Es kommen keine Zahlen doppelt im Array vor.");
		}
		
		s.close();
	}
}
