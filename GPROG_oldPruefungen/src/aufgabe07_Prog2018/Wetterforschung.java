package aufgabe07_Prog2018;

import java.util.Scanner;

/*
 * Wetterforschung
 * 
 * Erstellen Sie ein Array in dem die monatlichen 
 * Durchschnittstemperaturen der Jahre 2000- 2014 gespeichert
 * werden können. 
 * Fragen Sie nach, ob die Zahlen eingelesen 
 * oder zufällig ermittelt werden sollen. 
 * In letzterem Fall verwenden Sie double Zufallszahlen von -5 bis +25.
 * 
 * In wie vielen Monaten war es kälter als 10 Grad?
 * Berechnen Sie dann die folgenden Durchschnittstemperaturen
 * und speichern Sie diese jeweils in einem Array 
 *    * der Jahre (also von 2000, 2001, …)
 *    * der jeweiligen Monate (also von Jänner, Februar, …)
 * Geben Sie dann (basierend auf obigen Arrays)
 *    * das kälteste Jahr und
•	den wärmsten Monat		[2]
aus.

 */
public class Wetterforschung 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String eingabe;
		boolean eingeben;
		
		final int vonJahr = 2000;
		final int bisJahr = 2014;
		final double minTemp = -5;
		final double maxTemp = 25;
		String[] monate = new String[]{"Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
		double temperaturen[][] = new double[bisJahr - vonJahr + 1][monate.length];
		double temperatur;
		int kaelterAls10;
		double jahresSchnitt[] = new double[bisJahr - vonJahr + 1];
		double monatsSchnitt[] = new double[monate.length];
		double kaeltesteJahresTemp;
		double waermsteMonatsTemp;
		
		System.out.println("Sollen die Daten eingegeben werden? (\"JA\")");
		System.out.println("Bei einer anderen Eingabe werden die Daten zufällig generiert.");
		System.out.println();
		System.out.print("Ihre Wahl: ");
		eingabe = s.next();
		eingeben = eingabe.toUpperCase().equals("JA");
		
		for (int jahr = 0; jahr < temperaturen.length; jahr++)
		{
			for (int monat = 0; monat < temperaturen[jahr].length; monat++)
			{
				if (eingeben)
				{
					System.out.print("Temperatur im " + monate[monat] + " " + (jahr + vonJahr) + ": ");
					temperatur = s.nextDouble();
				}
				else
				{
					temperatur = Math.random() * (maxTemp - minTemp + 1) + minTemp;
				}
				temperaturen[jahr][monat] = temperatur;
			}
		}
		
		for (int monat = 0; monat < monatsSchnitt.length; monat++)
		{
			monatsSchnitt[monat] = 0;
		}
		
		kaelterAls10 = 0;
		for (int jahr = 0; jahr < temperaturen.length; jahr++)
		{
			jahresSchnitt[jahr] = 0;
			for (int monat = 0; monat < temperaturen[jahr].length; monat++)
			{
				if (temperaturen[jahr][monat] < 10)
				{
					kaelterAls10++;
				}
				jahresSchnitt[jahr] += temperaturen[jahr][monat];
				monatsSchnitt[monat] += temperaturen[jahr][monat];
			}
			jahresSchnitt[jahr] /= monate.length;
		}
		
		for (int monat = 0; monat < monatsSchnitt.length; monat++)
		{
			monatsSchnitt[monat] /= temperaturen.length;
		}

		System.out.println("In " + kaelterAls10 + " Monaten war es kälter als 10 Grad.");
		// Zur Kontrolle:
		System.out.println();
		System.out.println("Die Durchschnittstemperaturen der Jahre: ");
		for (int jahr = 0; jahr < jahresSchnitt.length; jahr++)
		{
			System.out.printf("%4d : % 5.2f\n", jahr + vonJahr, jahresSchnitt[jahr]);
		}
		
		kaeltesteJahresTemp = maxTemp;
		for (int jahr = 0; jahr < jahresSchnitt.length; jahr++)
		{
			if (jahresSchnitt[jahr] < kaeltesteJahresTemp)
			{
				kaeltesteJahresTemp = jahresSchnitt[jahr];
			}
		}
		
		System.out.println();
		System.out.println("In den folgenden Jahren war es im Schnitt am kältesten:");
		for (int jahr = 0; jahr < jahresSchnitt.length; jahr++)
		{
			if (jahresSchnitt[jahr] == kaeltesteJahresTemp)
			{
				System.out.println(jahr + vonJahr);;
			}
		}

		
		System.out.println();
		System.out.println("Die Durchschnittstemperaturen der Monate: ");
		for (int monat = 0; monat < monatsSchnitt.length; monat++)
		{
			System.out.printf("%-11s : % 5.2f\n", monate[monat], monatsSchnitt[monat]);
		}

		waermsteMonatsTemp = minTemp;
		
		for (int monat = 0; monat < monatsSchnitt.length; monat++)
		{
			if (monatsSchnitt[monat] > waermsteMonatsTemp)
			{
				waermsteMonatsTemp = monatsSchnitt[monat];
			}
		}

		System.out.println();
		System.out.println("In den folgenden Monaten war es im Schnitt am wärmsten:");
		for (int monat = 0; monat < monatsSchnitt.length; monat++)
		{
			if (monatsSchnitt[monat] == waermsteMonatsTemp)
			{
				System.out.println(monate[monat]);
			}
		}

	}

}
