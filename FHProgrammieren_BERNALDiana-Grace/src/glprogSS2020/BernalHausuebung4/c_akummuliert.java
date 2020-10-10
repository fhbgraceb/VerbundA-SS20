package BernalHausuebung4;

import java.util.Scanner;

public class c_akummuliert {
	/*
	 3. akummuliert: Schreiben Sie ein Programm, welches eine Zahl x einliest und
		danach so lange die Zahlen von 1 bis n aufsummiert bis die Summe die Zahl x
		übersteigt. Geben Sie sowohl n, als auch die akummulierte Summe aus.
	
	Beispiel:
	Eingabe: 9
	Ausgabe: Zahl: 4; Summe: 10
	Erklärung:
	1 < 9
	1 + 2 = 3 < 9
	1 + 2 + 3 = 6 < 9
	1 + 2 + 3 + 4 = 10 > 9
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("c_akummuliert_____________________\n");
		
		int max = 0;
		int sum = 0;
		int zahl = 0;
		
		System.out.print("Grenze eingeben:");
		max = s.nextInt();
		
		for (int i = 1; i <= max; i++)
		{
			sum += i;
			if (sum >= max)
			{
				zahl = i;
				break;
			}
		}
		System.out.println("Zahl: " + zahl+", Summe: "+sum);

	s.close();
	}

}
