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
public class Rechenart 
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
		
		if (operator.equals("+")) 
		{
			ergebnis = operand1 + operand2;
		}
		else if (operator.equals("-"))
		{
			ergebnis = operand1 - operand2;
		}
		else if (operator.equals("*"))
		{
			ergebnis = operand1 * operand2;
		}
		else if (operator.equals("/"))
		{
			ergebnis = operand1 / operand2;
		}
		else
		{
			/*
			 * Hier ist ein Problem:
			 * Das aufrufende Programm hat einen falschen Parameter angegeben,
			 * die Berechnug kann nicht durchgeführt werden.
			 * Wie kann man das dem aufrufenden Programm mitteilen?
			 * Der Aufruf des Unterprogramms kann in einer komplexen Berechnung erfolgen,
			 * in der es keine direkte Interaktion mit NutzerInnen gibt.
			 * Eine Lösung wird im nächsten Semester im Kapitel "Exeption"s behandelt.
			 */
			System.out.println("FEHLER !!!: Unbekannter Operator: >" + operator + "<");
		}
		
		return ergebnis;
	}
}
