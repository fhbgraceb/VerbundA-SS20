package zeilingerLukas_1;

import java.util.Scanner;

public class Preis 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Geben Sie den Preis des Artikels in € ein :");
		String pr = scanner.next();
		System.out.println("Geben Sie die Anzahl an  gekauften Artikel ein :");
		String az = scanner.next();
		System.out.println("Geben Sie den Mwst-Satz ein (in %) :");
		String mw = scanner.next();
		
		double preis = Double.parseDouble(pr);
		int anzahl = Integer.parseInt(az);
		double mwst = Double.parseDouble(mw);
		
		mwst = (mwst / 100)+1;
		
		System.out.println("Gesamtpreis : " + (preis*anzahl*mwst));

	}
}
