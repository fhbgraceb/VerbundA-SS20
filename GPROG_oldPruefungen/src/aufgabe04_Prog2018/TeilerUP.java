package aufgabe04_Prog2018;

import java.util.Scanner;

/*
 * Teiler: 
 * Lesen Sie zwei ganze Zahlen ein und ermitteln Sie, 
 * ob die zuletzt eingegebene Zahl ein Teiler der zuerst 
 * eingegebenen Zahl ist. 
 * 
 * (z.B. 
 *  Eingabe: 7 3 
 *  Ausgabe: 3 teilt 7 nicht. 
 *  
 *  Eingabe: 15 5 
 *  Ausgabe: 5 teilt 15) 
 */
public class TeilerUP 
{

	public static boolean teilt(int zahl, int teiler)
	{
		return (zahl % teiler == 0);
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int zahl1;
		int zahl2;
		
		System.out.print("Bitte die erste Zahl eingeben: ");
		zahl1 = s.nextInt();
		System.out.print("Bitte die zweite Zahl eingeben: ");
		zahl2 = s.nextInt();
		
		if (teilt(zahl1, zahl2))
		{
			System.out.println(zahl2 + " teilt " + zahl1 + ".");
		}
		else
		{
			System.out.println(zahl2 + " teilt " + zahl1 + " nicht.");
		}
	}

}
