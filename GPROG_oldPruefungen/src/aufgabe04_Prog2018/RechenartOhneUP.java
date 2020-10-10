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
public class RechenartOhneUP 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double zahl1;
		double zahl2;
		String operator;
		
		System.out.print("Geben Sie die erste Zahl ein: ");
		zahl1 = s.nextDouble();
		System.out.print("Geben Sie die zweite Zahl ein: ");
		zahl2 = s.nextDouble();
		System.out.print("Geben Sie den Operator ein: ");
		operator = s.next();
		
		if (operator.equals("+")) 
		{
			System.out.println("Das Ergebnis der Addition ist: " + (zahl1 + zahl2));
		}
		else if (operator.equals("-"))
		{
			System.out.println("Das Ergebnis der Subtraktion ist: " + (zahl1 - zahl2));
		}
		else if (operator.equals("*"))
		{
			System.out.println("Das Ergebnis der Multiplikation ist: " + (zahl1 * zahl2));
		}
		else if (operator.equals("/"))
		{
			System.out.println("Das Ergebnis der Division ist: " + (zahl1 / zahl2));
		}
		else
		{
			// Der Operator wird zwischen >< eingeschlossen, um zu erkennen,
			// ob man etwa ein Leerzeichen eingegeben hat.
			System.out.println("Unbekannter Operator: >" + operator + "<");
		}
		
		s.close();
	}

}
