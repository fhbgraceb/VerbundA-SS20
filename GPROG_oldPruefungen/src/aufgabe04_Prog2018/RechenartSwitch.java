package aufgabe04_Prog2018;

import java.util.Scanner;

/*
 * Rechenart : 
 * Lesen Sie zwei Zahlen und einen mathematischen Operator (“+“, “-“, “*“, “/“) ein
 * und geben Sie das Ergebnis der Berechnung aus, 
 * wenn man die Zahlen mit dem Operator verknüpft. 
 * 
 * Falls ein unbekannter Operator eingegeben wird (“%“, “?“, ...) 
 * soll eine entsprechende Meldung ausgegeben werden.
 * 
 * Beispiel:
 *    Eingabe: 2, 3, “*“
 *    Ausgabe: 6
 *    
 *    [Erklärung: 2 * 3 = 6]
 */
public class RechenartSwitch 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double zahl1;
		double zahl2;
		double ergebnis;
		String operator;
		
		System.out.print("Geben Sie die erste Zahl ein: ");
		zahl1 = s.nextDouble();
		System.out.print("Geben Sie die zweite Zahl ein: ");
		zahl2 = s.nextDouble();
		System.out.print("Geben Sie den Operator ein: ");
		operator = s.next();
		
		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) 
		{
			ergebnis = berechnung(zahl1, zahl2, operator);
			System.out.println("Das Ergebnis der Berechnung ist: " + ergebnis);
		}
		else
		{
			// Der Operator wird zwischen >< eingeschlossen, um zu erkennen,
			// ob man etwa ein Leerzeichen eingegeben hat.
			System.out.println("Der Operator >" + operator + "< ist nicht bekannt.");
		}
		
		s.close();
	}

	public static double berechnung(double operand1, double operand2, String operator)
	{
		double ergebnis = 0;
		
		switch (operator) {
			case "+" : ergebnis = operand1 + operand2;
					break;
			case "-" : ergebnis = operand1 - operand2;
					break;
			case "*" : ergebnis = operand1 * operand2;
					break;
			case "/" : ergebnis = operand1 / operand2;
					break;
			default: // Beachten Sie bitte die Anmerkung an der entsprechenden Stelle in Rechenart.
						System.out.println("FEHLER !!!: Unbekannter Operator: >" + operator + "<");
		}
		
		return ergebnis;
	}
}
