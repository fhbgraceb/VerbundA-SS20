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
public class Einkommensteuer1UP 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double einkommen;
		
		System.out.print("Wie hoch ist Ihr Einkommen? ");
		einkommen = s.nextDouble();
		
		if (einkommensteuerPflichtig(einkommen))
		{
			System.out.println("Sie müssen Einkommensteuer bezahlen.");
		}
		else
		{
			System.out.println("Sie müssen keine Einkommensteuer bezahlen.");
		}
		
		System.out.println("Sie müssen" + (einkommensteuerPflichtigProfi(einkommen) ? " " : " keine ") + "Einkommensteuer bezahlen.");

		s.close();
	}
	
	public static boolean einkommensteuerPflichtig(double einkommen)
	{
		final double steuerGrenze = 10000;
		boolean einkommensteuerPflichtig;

		if (einkommen >= steuerGrenze)
		{
			einkommensteuerPflichtig = true;
		}
		else
		{
			einkommensteuerPflichtig = false;
		}
		
		return einkommensteuerPflichtig;
	}

	public static boolean einkommensteuerPflichtigProfi(double einkommen)
	{
		final double steuerGrenze = 10000;

		return (einkommen >= steuerGrenze); 
	}
}
