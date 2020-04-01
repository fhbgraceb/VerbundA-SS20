package ersteHausuebung;

import java.util.Scanner;

/*		Angabe zur Übung 1 nun online. Zusätzlich zu den Beispielen im Eclipse-Projekt, 
gilt es noch einen BMI-Rechner mit Benutzereingabe, Kennzahl inkl. einer Empfehlung - 
zB optimal, zu dünn/dick, etc. 

sowie einen "Haustüröffnungsprozess" abzulichten, 
Haus und Tür müssen korrekt sein, Anlehnung an Algo- bzw. Passwordlogin-BSP, 
jedoch mit einer kleinen Adaption, dass Haus kann mit 2 Schlüsseln 
aufgesperrt werden. Beide öffnen die Tür, sofern es sich um das korrekt Haus handelt.
*/

public class BMIrechner {

	public static void main(String[] args) {
		
		try {
			double gewicht;
			double groesse;

			Scanner eingabe=new Scanner(System.in);
			
			System.out.print("Geben Sie Ihr Körpergewicht in Kilogramm ein: ");
			gewicht = eingabe.nextDouble();
			
			System.out.print("Geben Sie Ihre Körpergröße in Zentimeter ein: ");
			groesse = eingabe.nextDouble();
			
			double bmiWert = (gewicht /  (groesse * groesse))*10000 ;
			System.out.println("BMI Wert: " + bmiWert);
			
			if (bmiWert >= 25) {
				System.out.println("Bei einem BMI Wert über 25 gelten Sie als zu dick!");
				}
			else if (bmiWert < 25 && bmiWert >= 18.5 ) {
				System.out.println("Ihr BMI Wert liegt im optimalen Bereich!");

				}
			else {
				System.out.println("Bei einem BMI Wert unter 18.5 gelten Sie zu dünn!");
				}
			
			
			eingabe.close();
		} catch (Exception e) {
			System.out.println("Eingabe war keine Zahl" + e.getMessage());
		}
		
		System.out.println("Das Programm ist noch am Leben!");
			
		}
	}

