package aufgabe03;

import java.util.Scanner;

/*
 * Die Oberfläche eines Zylinders besteht aus 
 * 		* zwei Kreis(flächen) oben und unten
 * 		* einem Rechteck rundherum mit den Seitenlängen
 * 				* einerseits der Höhe des Zylinders
 * 				* andererseits des Umfangs der Kreise oben und unten
 *  Um all dies zu berechnen wurden bereits die richtigen Unterprogramme 
 *  geschrieben und können nun verwendet werden.
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
		
		System.out.print("Bitte geben Sie die Höhe ein: ");
		hoehe = s.nextDouble();
		System.out.print("Bitte geben Sie den Radius ein: ");
		radius = s.nextDouble();

		umfang = Kreis.berechneUmfang(radius);
		oberflaeche = (2 * Kreis.berechneFlaeche(radius)) + Rechteck.berechneFlaeche(hoehe, umfang);

		System.out.println("Die Oberfläche des Zylinders beträgt: " + oberflaeche);
		
		s.close();
	}

}
