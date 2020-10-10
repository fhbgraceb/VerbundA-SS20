package aufgabe05_Prog2018;

import java.util.Scanner;

/*
 * PerfekteZahl: 
 * 
 * Eine Zahl hei�t perfekt, wenn 
 * 	die Summe ihrer echten Teiler 
 *      (das sind alle Teiler, die kleiner als die Zahl selbst sind) 
 * 	gleich gro� ist, wie die Zahl. 
 *	Zum Beispiel ist 6 eine perfekte Zahl, 
 *      da 1, 2 und 3 die echten Teiler von 6 sind und 1+2+3=6 gilt. 
 * Falls die Summe der echten Teiler kleiner ist als die Zahl, 
 * 	hei�t die Zahl defizient. 
 * Falls die Summe der echten Teiler gr��er ist als die Zahl, 
 * 	hei�t die Zahl abundant. 
 * Schreiben Sie ein Programm, das eine nat�rliche Zahl einliest und ausgibt, 
 * 	ob die eingelesene Zahl perfekt, defizient oder abundant ist.
 * 
 * Eingabe 	Ausgabe 	Begr�ndung 
 * 	5		defizient 	1 ist einziger echter Teiler 
 * 	6 		perfekt 	1+2+3=6 
 * 12 		abundant 	1+2+3+4+6=16>12 
 */
public class PerfekteZahlMitErklaerung 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int zahl;
		int teilerSumme;
		String eigenschaft;
		
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		zahl = s.nextInt();
		
		teilerSumme = 0;
		// Nun werden alle Zahlen, die kleiner als die einegebene Zahl sind ...
		for (int teiler = 1; teiler < zahl; teiler++)
		{
			// ... �berpr�ft, ob sie die eingegebene Zahl teilen.
			if (zahl % teiler == 0)
			{
				// Falls es wirklich ein Teiler ist, wird er zur Summe addiert.
				teilerSumme += teiler;
			}
		}
		
		/*
		 *  Um sicher immer denselben Satz auszugeben
		 *  wird dieser erst nach dem if ausgegeben und die Eigenschaft
		 *  in einer eigenen Variable gespeichert. 
		 */
		if (teilerSumme < zahl)
		{
			eigenschaft = "defizient";
		} 
		else if (teilerSumme > zahl)
		{
			eigenschaft = "abundant";
		}
		else	// teilerSumme == zahl - alle anderen M�glichkieten wurden bereits �berpr�ft
		{
			eigenschaft = "perfekt";
		}
		
		System.out.println("Die Zahl " + zahl + " ist " + eigenschaft + ".");
	}

}
