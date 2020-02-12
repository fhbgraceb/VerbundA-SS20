package Zeilinger_Lukas_Aufgabe5_1_3_6_8_9_10_12_13_16_19_20_21;

import java.util.Scanner;

public class PerfekteZahl {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int eingabe = 0;
		int summe = 0;
		boolean defizient = false;
		boolean perfekt = false;
		boolean abundant = false;
		
		System.out.print("Geben Sie eine Zahl ein: ");
		eingabe = scan.nextInt();
		
		for(int i = 1; i < eingabe; i++)
		{
			if(eingabe % i == 0) summe += i;
		}
		if(summe < eingabe) defizient = true;
		if(summe == eingabe) perfekt = true;
		if(summe > eingabe) abundant = true;
		
		if(defizient == true) System.out.println(eingabe+ " = Defizient");
		if(perfekt == true) System.out.println(eingabe+ " = PERFEKT");
		if(abundant == true) System.out.println(eingabe+ " = Abundant");

	}

}
