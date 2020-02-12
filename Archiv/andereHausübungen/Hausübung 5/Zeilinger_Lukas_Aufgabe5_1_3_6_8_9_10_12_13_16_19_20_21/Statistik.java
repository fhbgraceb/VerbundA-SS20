package Zeilinger_Lukas_Aufgabe5_1_3_6_8_9_10_12_13_16_19_20_21;

import java.util.Scanner;

public class Statistik {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int eingabe = -1;
		int min = 1000;
		int max = -1000;
		int counter = 0;
		double mittelwert = 0;
		
		while(eingabe != 0)
		{
			System.out.print("Geben Sie eine Zahl ein: ");
			eingabe = scan.nextInt();
			counter ++;
			
			if (eingabe < min && eingabe != 0)
			{
				min = eingabe;
			}
			else if ( eingabe > max && eingabe != 0)
			{
				max = eingabe;
			}
			mittelwert += eingabe;
		}
		mittelwert = mittelwert/(counter-1);
		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);
		System.out.println("Mittelwert = " + mittelwert);
				

	}

}
