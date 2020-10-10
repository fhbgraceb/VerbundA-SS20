package aufgabe04;

import java.util.Scanner;

/*
 * Beispielgruppe 3 - Bedingungen
 *
 * Einkommensteuer1: 
 * 
 * Lesen Sie das Einkommen einer Person ein und geben Sie aus, 
 * ob die Person Einkommensteuer zahlen muss. 
 * 
 * (Einkommensteuer muss ab einem Einkommen von 10000 € bezahlt werden.)
 */
public class Einkommensteuer1 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		final double steuerGrenze = 10000;
		double einkommen;
		
		System.out.print("Wie hoch ist Ihr Einkommen? ");
		einkommen = s.nextDouble();
		
		if (einkommen >= steuerGrenze)
		{
			System.out.println("Sie müssen Einkommensteuer bezahlen.");
		}
		else
		{
			System.out.println("Sie müssen keine Einkommensteuer bezahlen.");
		}
		
		s.close();
	}

}
