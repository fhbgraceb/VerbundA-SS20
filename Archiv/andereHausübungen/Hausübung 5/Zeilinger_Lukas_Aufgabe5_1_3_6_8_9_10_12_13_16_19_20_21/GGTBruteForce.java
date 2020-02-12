package Zeilinger_Lukas_Aufgabe5_1_3_6_8_9_10_12_13_16_19_20_21;

import java.util.Scanner;

public class GGTBruteForce {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int zahl1 = 0;
		int zahl2 = 0;
		int summe = 0;
		int ggt = 0;
		
		System.out.print("Geben Sie Zahl 1 ein: ");
		zahl1 = scan.nextInt();
		System.out.print("Geben Sie Zahl 1 ein: ");
		zahl2 = scan.nextInt();
		
		for (int i = 0; i <= zahl1; i++) 
		{
			for (int j = 0; j <= zahl2; j++) 
			{
				summe = i+j;
				if(summe > 0 && zahl1 % summe == 0 && zahl2 % summe == 0 && summe > ggt)ggt = summe;
			}
		}
		System.out.println("Der GGT von "+zahl1+" & "+zahl2+" = " +ggt);
		

	}

}
