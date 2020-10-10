package aufgabe05;

import java.util.Scanner;

/*
 * Beispielgruppe 3 - Bedingungen
 *
 * Ziffernsumme3:
 * Schreiben Sie ein Programm, 
 * das eine dreistellige Zahl einliest 
 * und mit Hilfe der Ziffernsumme überprüft, 
 * ob die eingegebene Zahl durch 3 teilbar ist. 
 * 
 * Benutzen Sie dazu keine Schleifen 
 * (und gehen Sie davon aus, dass die Zahl wirklich 3 Stellen hat).
 */
public class Ziffernsumme3UP2 
{
	public static int ziffernsumme(int zahl)
	{
		/*
		 * Es wird jeweils die letzte Ziffer geholt
		 * und zur Ziffernsumme addiert.
		 * Dann wird die letzte Ziffer "entfernt".
		 */

		int ziffer;
		int restZahl;
		int ziffernsumme;

		ziffer = zahl % 10;
		ziffernsumme = ziffer;	// erste Summe entspricht der letzten Ziffer
		restZahl = (zahl - ziffer) / 10;
		
		ziffer = restZahl % 10;
		ziffernsumme += ziffer;
		restZahl = (restZahl - ziffer) / 10;
		
		ziffer = restZahl % 10;
		ziffernsumme += ziffer;

		return ziffernsumme;
	}
	
	public static boolean durch3teilbar(int zahl)
	{
		return ziffernsumme(zahl) % 3 == 0;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int zahl;
		
		System.out.print("Bitte eine dreistellige Zahl eingeben: ");
		zahl = s.nextInt();
		
		/*
		 * Zusätzlicher Test, ob die Zahl dreistellig ist.
		 * Zahl wird mit der kleinsten und größten 
		 * dreisteligen Zahl verglichen.
		 */
		if ((zahl >= 100) && (zahl <= 999))
		{
			if (durch3teilbar(zahl))
			{
				System.out.println(zahl + " ist durch 3 teilbar.");
			}
			else
			{
				System.out.println(zahl + " ist nicht durch 3 teilbar.");
			}
		}
		else
		{
			System.out.println("Zahl ist nicht dreistellig");
		}
	}

}
