package aufgabe06;

import java.util.Scanner;

/*
 * Vorhanden: 
 * 
 * Lesen Sie 10 Zahlen in ein Array ein. 
 * Lesen Sie dann eine weitere Zahl ein und stellen Sie fest, 
 * ob die neue Zahl im Array vorkommt.
 */
public class Vorhanden 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		final int anzahlZahlen = 10;		// Um die Anzahl leicht ändern zu könnne
		int[] zahlen = new int[anzahlZahlen];
		int zahl;
		boolean vorhanden;
		
		for (int i = 0; i < anzahlZahlen; i++)
		{
			System.out.print("Bitte geben Sie die " + (i + 1) + ". Zahl (von " + anzahlZahlen + ") ein: ");
			zahlen[i] = s.nextInt();
		}
		
		System.out.print("Bitte geben Sie noch eine Zahl ein: ");
		zahl = s.nextInt();
		
		vorhanden = false;
		for (int i = 0; i < anzahlZahlen; i++)
		{
			if (zahlen[i] == zahl)
			{
				vorhanden = true;
			}
		}
		
		if (vorhanden)
		{
			System.out.println(zahl + " kommt im Array vor.");
		}
		else
		{
			System.out.println(zahl + " kommt nicht im Array vor.");
		}
		
		s.close();
	}

}
