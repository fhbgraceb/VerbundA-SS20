package ersteHausuebung;

import java.util.Scanner;

/*		Angabe zur �bung 1 nun online. Zus�tzlich zu den Beispielen im Eclipse-Projekt, 
gilt es noch einen BMI-Rechner mit Benutzereingabe, Kennzahl inkl. einer Empfehlung - 
zB optimal, zu d�nn/dick, etc. 

sowie einen "Haust�r�ffnungsprozess" abzulichten, 
Haus und T�r m�ssen korrekt sein, Anlehnung an Algo- bzw. Passwordlogin-BSP, 
jedoch mit einer kleinen Adaption, dass Haus kann mit 2 Schl�sseln 
aufgesperrt werden. Beide �ffnen die T�r, sofern es sich um das korrekt Haus handelt.
*/

public class BMIrechner {

	public static void main(String[] args) {
		
		try {
			double gewicht;
			double groesse;

			Scanner eingabe=new Scanner(System.in);
			
			System.out.print("Geben Sie Ihr K�rpergewicht in Kilogramm ein: ");
			gewicht = eingabe.nextDouble();
			
			System.out.print("Geben Sie Ihre K�rpergr��e in Zentimeter ein: ");
			groesse = eingabe.nextDouble();
			
			double bmiWert = (gewicht /  (groesse * groesse))*10000 ;
			System.out.println("BMI Wert: " + bmiWert);
			
			if (bmiWert >= 25) {
				System.out.println("Bei einem BMI Wert �ber 25 gelten Sie als zu dick!");
				}
			else if (bmiWert < 25 && bmiWert >= 18.5 ) {
				System.out.println("Ihr BMI Wert liegt im optimalen Bereich!");

				}
			else {
				System.out.println("Bei einem BMI Wert unter 18.5 gelten Sie zu d�nn!");
				}
			
			
			eingabe.close();
		} catch (Exception e) {
			System.out.println("Eingabe war keine Zahl" + e.getMessage());
		}
		
		System.out.println("Das Programm ist noch am Leben!");
			
		}
	}

