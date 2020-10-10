package aufgabe04;

import java.util.Scanner;

/*
 * Beispielgruppe 3 - Bedingugen
 * 
 * Bauordnung: 
 * Laut Wr. Bauordnung darf ein Haus in einer Gartensiedlung 
 * die Höhe von 4,50 m nicht übersteigen 
 * und nicht mehr als 80m2 Grundfläche besitzen. 
 * Darüber hinaus darf die Grundfläche des Hauses nicht mehr als 25% der Grundstücksfläche ausmachen.
 * 
 * Schreiben Sie ein Programm, 
 * das die Grundstücksgröße, sowie die Grundfläche und Höhe des geplanten Hauses einliest
 * und entscheidet, ob das Haus gebaut werden darf. 
 */
public class BauordnungUP 
{

	public static boolean darfGebautWerden(double hoehe, double flaeche, double grundstueck)
	{	
		final double maxHoehe = 4.5;
		final double maxFlaeche = 80;
		final double maxAnteil = 0.25;
		
		return ((hoehe <= maxHoehe) && (flaeche <= maxFlaeche) && ((flaeche / grundstueck) <= maxAnteil));
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		double hoehe;
		double flaeche;
		double grundstueck;
		
		System.out.println("Bitte geben Sie die Daten Ihres Bauprojektes ein:");
		System.out.print("Höhe: ");
		hoehe = s.nextDouble();
		System.out.print("Fläche des Hauses: ");
		flaeche = s.nextDouble();
		System.out.print("Fläche des Grundstücks: ");
		grundstueck = s.nextDouble();
		System.out.println("Danke für die Info.");
		System.out.println();
		
		if (darfGebautWerden(hoehe, flaeche, grundstueck))
		{
			System.out.println("Ihr Haus darf gebaut werden.");
		}
		else
		{
			System.out.println("Leider darf Ihr Haus nicht gebaut werden.");
		}
	}

}
