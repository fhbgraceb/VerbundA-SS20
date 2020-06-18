package aufgabe04;

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
public class Ziffernsumme3 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int zahl;
		int ziffer;
		int restZahl;
		int ziffernsumme;
		
		System.out.print("Bitte eine dreistellige Zahl eingeben: ");
		zahl = s.nextInt();
		
		/*
		 * Zusätzlicher Test, ob die Zahl dreistellig ist.
		 * Zahl wird mit der kleinsten und größten 
		 * dreisteligen Zahl verglichen.
		 */
		if ((zahl >= 100) && (zahl <= 999))
		{
			/*
			 * Nun wird jeweils die letzte Ziffer geholt
			 * und zur Ziffernsumme addiert.
			 * Dann wird die letzte Ziffer "entfernt".
			 * 
			 * Zur Kontrolle im Debug-Modus ansehen!!!
			 */
			ziffer = zahl % 10;
			ziffernsumme = ziffer;	// erste Summe entspricht der letzten Ziffer
			restZahl = (zahl - ziffer) / 10;
			
			ziffer = restZahl % 10;
			ziffernsumme += ziffer;
			restZahl = (restZahl - ziffer) / 10;
			
			ziffer = restZahl % 10;
			ziffernsumme += ziffer;

			if (ziffernsumme % 3 == 0)
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
