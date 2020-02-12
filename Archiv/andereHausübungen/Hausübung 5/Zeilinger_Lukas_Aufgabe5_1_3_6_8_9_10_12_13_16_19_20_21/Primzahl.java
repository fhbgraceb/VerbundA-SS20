package Zeilinger_Lukas_Aufgabe5_1_3_6_8_9_10_12_13_16_19_20_21;

import java.util.Scanner;

public class Primzahl {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int eingabe = 0;
		boolean teilbar = false;
		
		System.out.println("Geben Sie eine Zahl ein: ");
		eingabe = scan.nextInt();
		
		for(int i = 2; i < eingabe; i++)
		{
			if(eingabe % i == 0) teilbar=true;
		}
		if(teilbar == true) System.out.println("Keine Primzahl");
		else System.out.println("Primzahl!");

	}

}
