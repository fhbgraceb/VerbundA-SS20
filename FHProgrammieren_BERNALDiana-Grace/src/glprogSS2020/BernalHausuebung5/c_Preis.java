package BernalHausuebung5;

import java.util.Scanner;

public class c_Preis {
	
	/*
	 3. Preis: Lesen Sie Artikelpreis, Anzahl der gekauften Artikel und
	Mehrwertsteuersatz ein und geben Sie den Gesamtpreis aus. [4] 
	 */
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int anzahl;
		double preis;
		double mwSt;
		double zwischenpreis;
		
		System.out.print("Anzahl der gekauften Artikel eingeben: ");
		anzahl = s.nextInt();
		
		double[] gesamtpreisliste=new double[anzahl];
		
		for (int i = 0; i < anzahl; i++) {
			System.out.print("Artikelpreis von Artikel "+(i+1)+" eingeben: ");
			preis = s.nextDouble();
			System.out.print("MwSt % von Artikel "+(i+1)+" eingeben: ");
			mwSt = s.nextDouble();
			
			zwischenpreis = preis(preis, anzahl, mwSt);
			gesamtpreisliste[i]=zwischenpreis;
		}
		
		double summe=berechnungSumme(gesamtpreisliste, anzahl);
		
		System.out.println("Gesamtpreis: " + summe);
		
		s.close();
	}
	
	private static double berechnungSumme(double []array, int max) {
		double sum = 0;
		for (int i = 0; i < max; i++) {
			sum=+array[i];
		}
		return sum;
	}

	public static double preis(double geld, int anzahl, double steuer){
		double ergebnis = 0;
		ergebnis = (geld * anzahl) * (100 + steuer) / 100;
		return ergebnis;
	}


}
