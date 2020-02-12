package Zeilinger_Lukas_Aufgabe5_1_3_6_8_9_10_12_13_16_19_20_21;

import java.util.Scanner;

public class Akummuliert {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int grenze = 0;
		int sum = 0;
		int zahl = 0;
		
		System.out.print("Geben Sie eine Grenze ein:");
		grenze = scan.nextInt();
		
		for (int i = 1; i <= grenze; i++)
		{
			sum += i;
			if (sum >= grenze)
			{
				zahl = i;
				break;
			}
		}
		System.out.println("Zahl: " + zahl+", Summe: "+sum);
	}

}
