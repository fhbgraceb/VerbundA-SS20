package aufgabe03;

import java.util.Scanner;

public class Kreis 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double radius;
		double umfang;
		double flaeche;
		
		System.out.print("Bitte geben Sie den Radius ein: ");
		radius = s.nextDouble();
		
		umfang = berechneUmfang(radius);
		flaeche = berechneFlaeche(radius);
		
		System.out.println("Umfang: " + umfang);
		System.out.println("Fläche: " + flaeche);
		
		s.close();
	}

	public static double berechneFlaeche(double radius) 
	{
		double flaeche;
		
		flaeche = radius * radius * Math.PI;
		
		return flaeche;
	}

	public static double berechneUmfang(double radius) 
	{
		double umfang;
		
		umfang = 2 * radius * Math.PI;
		
		return umfang;
	}

}
