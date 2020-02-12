package aufgabe03;

import java.util.Scanner;

/*
 * Die Oberfl�che eines Zylinders besteht aus 
 * 		* zwei Kreis(fl�chen) oben und unten
 * 		* einem Rechteck rundherum mit den Seitenl�ngen
 * 				* einerseits der H�he des Zylinders
 * 				* andererseits des Umfangs der Kreise oben und unten
 *  Um all dies zu berechnen wurden bereits die richtigen Unterprogramme 
 *  geschrieben und k�nnen nun verwendet werden.
 */
public class Zylinder 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double radius;
		double hoehe;
		double oberflaeche;
		double umfang;			// Eine Hilfsvariable
		
		System.out.print("Bitte geben Sie die H�he ein: ");
		hoehe = s.nextDouble();
		System.out.print("Bitte geben Sie den Radius ein: ");
		radius = s.nextDouble();

		umfang = Kreis.berechneUmfang(radius);
		oberflaeche = (2 * Kreis.berechneFlaeche(radius)) + Rechteck.berechneFlaeche(hoehe, umfang);

		System.out.println("Die Oberfl�che des Zylinders betr�gt: " + oberflaeche);
		
		s.close();
	}

}
