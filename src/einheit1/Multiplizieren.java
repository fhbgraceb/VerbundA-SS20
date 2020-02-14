package einheit1;

import java.util.Scanner;

public class Multiplizieren {
@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Geben Sie den ersten Faktor ein: ");
		int z1 = scan.nextInt();
		System.out.println("Geben Sie den zweiten Faktor ein: ");
		int z2 = scan.nextInt();
		
		System.out.println("Das Ergebnis von " + z1 + " und der Zahl " + z2 + " der Eingabe lautet: " + (z1*z2));
		
	}
}
