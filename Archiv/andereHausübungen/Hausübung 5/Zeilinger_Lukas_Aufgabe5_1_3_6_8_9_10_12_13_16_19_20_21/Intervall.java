package Zeilinger_Lukas_Aufgabe5_1_3_6_8_9_10_12_13_16_19_20_21;

import java.util.Scanner;

public class Intervall {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int eingabe = -1;
		int grenzeU = 0;
		int grenzeO = 0;
		int kleiner = 0;
		int groeßer = 0;
		int imIntervall = 0;
		
		System.out.print("Geben Sie die Untergrenze ein: ");
		grenzeU = scan.nextInt();
		System.out.print("Geben Sie die Obergrenze ein: ");
		grenzeO = scan.nextInt();
		
		
		
		while(eingabe != 0)
		{
			System.out.print("Geben Sie eine Zahl ein: ");
			eingabe = scan.nextInt();
			
			if(eingabe < grenzeU && eingabe != 0) kleiner++;

			else if (eingabe > grenzeO) groeßer++;

			else if (eingabe >= grenzeU && eingabe <= grenzeO) imIntervall++;
			
		}
		System.out.println("---------------RESULT-------------");
		System.out.println("Darüber waren  " +groeßer+" Zahlen");
		System.out.println("Im Intervall waren "+imIntervall+" Zahlen");
		System.out.println("Darunter waren " +kleiner+" Zahlen");
		System.out.println("------------------------");

	}

}
