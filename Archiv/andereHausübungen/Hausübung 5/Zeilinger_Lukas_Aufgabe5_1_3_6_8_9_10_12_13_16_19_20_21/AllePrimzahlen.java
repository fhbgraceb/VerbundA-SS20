package Zeilinger_Lukas_Aufgabe5_1_3_6_8_9_10_12_13_16_19_20_21;

import java.util.Scanner;

public class AllePrimzahlen {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int eingabe = 0;
		int primzahl = 0;
		boolean teilbar = false;
		
		System.out.println("Geben Sie eine Zahl ein: ");
		eingabe = scan.nextInt();
		
		for(int i = 2; i < eingabe; i++)
		{
			teilbar = false;
			primzahl = i;
			for(int j = 2; j < i;j++)
			{
				if(primzahl % j == 0) teilbar = true;
			}
			if(teilbar == false) System.out.print(primzahl+", ");
			
		}

	}

}
