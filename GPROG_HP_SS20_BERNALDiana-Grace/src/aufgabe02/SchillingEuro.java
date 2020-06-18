package aufgabe02;

import java.util.Scanner;

/*
** Beispielgruppe 1 - Grundlagen: Ein/Ausgabe, einfache Berechnungen
** Beispiel SchillingEuro
** 
** Schreiben Sie ein Programm zur Umrechnung von Schilling in Euro.
** Geben Sie das Ergebnis formatiert in Euro und Cent aus.
** (Betragsteile kleiner als ein Cent können Sie ignorieren.). 
**
*/
public class SchillingEuro 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		final double kurs = 13.7603;	// konstanter kurs, kann nicht geändert werden
		double schilling;
		double euroGenau;				// Euro genau umgerechnet
		long ganzeCent;					// genauer Eurobetrag auf ganze Cent gerundet
		long ganzeEuro;					// davon die ganzen Euro
		long restCent;					//    und die Cent
		
		System.out.println("Bitte den Schilling-Betrag eingeben: ");
		schilling = s.nextDouble();

		euroGenau = schilling / kurs;				// Schilling in Euro umrechnen
		ganzeCent = Math.round(euroGenau * 100);	// auf Cent umrechnen und runden
		restCent = ganzeCent % 100;	
		ganzeEuro = (ganzeCent - restCent) / 100;
		
		System.out.println(schilling + " Schilling sind in Euro: " + euroGenau);
		System.out.println("Das sind " + ganzeCent + " Cent");
		System.out.println("Das sind " + ganzeEuro + " Euro und " + restCent + " Cent");		
	}
}







