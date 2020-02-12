package zeilingerLukas_1;

import java.util.Scanner;

public class Gauss 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Geben Sie eine Zahl ein :");
		String zahl1 = scanner.next();
		int zahl = Integer.parseInt(zahl1);
		
		int gesamt = (zahl * (zahl+1)/2);
		
		System.out.println("Summe der Zahlen von 1 bis " + zahl1 + ": " + (gesamt));

	}
}
