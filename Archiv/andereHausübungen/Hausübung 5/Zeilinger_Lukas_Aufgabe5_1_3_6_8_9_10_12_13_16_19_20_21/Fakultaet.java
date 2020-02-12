package Zeilinger_Lukas_Aufgabe5_1_3_6_8_9_10_12_13_16_19_20_21;

import java.util.Scanner;

public class Fakultaet {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int zahl = 0;
		int ergebnis = 1;
		System.out.println("Geben Sie eine Zahl ein: ");
		zahl = scan.nextInt();
		
		for(int i = 1; i <= zahl; i++)
		{
			ergebnis = ergebnis *i;
		}
		System.out.println(ergebnis);

	}

}
