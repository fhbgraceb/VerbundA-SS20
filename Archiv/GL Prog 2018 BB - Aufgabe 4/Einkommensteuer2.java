package aufgabe04;

import java.util.Scanner;

/*
 * Beispielgruppe 3 - Bedingungen
 *
 * Einkommensteuer2: 
 * 
 * Lesen Sie das Einkommen einer Person ein und berechnen Sie, 
 * wie viel Steuern von der Person zu bezahlen sind:
 * 
 *   * Wenn die Person weniger als 1000€ verdient muss keine Steuer bezahlt werden. 
 *   * Falls sie 1000 € oder mehr, aber weniger als 2000 € verdient so sind 10 % zu bezahlen. 
 *   * Für Einkommen von 2000 € bis unter 4000 € sind 25 %, 
 *   * von 4000 € bis unter 7500 € 40 % und 
 *   * ab 7500 € sind 50 % zu bezahlen.
 */

public class Einkommensteuer2 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double einkommen;
		double steuer;
		
		System.out.print("Wie groß ist Ihr Einkommen? ");
		einkommen = s.nextDouble();
		steuer = steuerBerechnung(einkommen);
		
		System.out.println("Bei einem Einkommen von " + einkommen + " ist folgende Steuer fällig: " + steuer);
		
		s.close();
	}

	public static double steuerBerechnung(double betrag)
	{
		double steuer = 0;
		
		if (betrag < 1000)
		{
			steuer = 0;
		}
		else if (betrag < 2000)
		{
			steuer = betrag * 0.1;
		}
		else if (betrag < 4000)
		{
			steuer = betrag * 0.25;
		}		
		else if (betrag < 7500)
		{
			steuer = betrag * 0.4;
		}
		else
		{
			steuer = betrag * 0.5;
		}
		
		return steuer;
	}
}
