package Zeilinger_Lukas_Aufgabe5_1_3_6_8_9_10_12_13_16_19_20_21;

import java.util.Scanner;

public class Radien {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		double umfang = 0;
		double radius = 1;
		double pi = Math.PI;
		
		while (radius != 0)
		{
			System.out.print("Eingabe Radius: ");
			radius = scan.nextDouble();
			
			if (radius < 0) 
			{
				System.out.println("Falsche Eingabe (Radius < 0)");
			}
			else if (radius > 0)
			{
				umfang = 2*pi*radius;
				System.out.println("Der Umfang lautet "+umfang);
			}
		}

	}

}
