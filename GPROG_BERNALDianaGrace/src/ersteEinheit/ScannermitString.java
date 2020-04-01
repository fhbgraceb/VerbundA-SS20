package ersteEinheit;

import java.util.Scanner;

public class ScannermitString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie die erste Zahl für die Addition ein: ");
		int zahl1 = scanner.nextInt();
		
		System.out.println("Und nun die Zweite");
		int zahl2 = scanner.nextInt();
		
		int ergebnis = zahl1+zahl2;

		System.out.println("Das Ergebnis von " +  zahl1 + " & " + zahl2 + " = " + (zahl1+zahl2) + " bzw. " + ergebnis);

		
		scanner.close();

	}

}