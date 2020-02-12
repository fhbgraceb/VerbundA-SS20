package aufgabe03;

import java.util.Scanner;

public class Rechteck 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double a;
		double b;
		double umfang;
		double flaeche;
		
		System.out.print("Bitte geben Sie den Wert für a ein: ");
		a = s.nextDouble();
		System.out.print("Bitte geben Sie den Wert für b ein: ");
		b = s.nextDouble();
		
		umfang = berechnungUmfang(a, b);
		flaeche = berechneFlaeche(a, b);
		
		System.out.println("Umfang: " + umfang);
		System.out.println("Fläche: " + flaeche);
		
		s.close();
	}
	
	public static double berechnungUmfang(double a, double b)
	{
		double umfang;
		
		umfang = 2 * a + 2 * b;
		
		return umfang;
	}

	public static double berechneFlaeche(double a, double b) 
	{
		double flaeche;
		
		flaeche = a * b;
		
		return flaeche;
	}

}
