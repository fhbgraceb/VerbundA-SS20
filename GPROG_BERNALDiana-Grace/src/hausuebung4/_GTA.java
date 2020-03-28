package hausuebung4;

import java.util.Scanner;

public class _GTA {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		boolean driving=true;
		int tank=1;
	
		while (driving) {
			if (tank != 0) {
				System.out.println("Wohin wollen Sie fahren?[Norden/Osten/Süden/Westen/Quit]\nIm Tank befindet sich " + tank + " Liter.");
				String direction = s.next();

				if (direction.equalsIgnoreCase("Norden")) {
					System.out.println("Sie fahren nach Norden.");
					tank--;
				} else if (direction.equalsIgnoreCase("Süden")) {
					System.out.println("Sie fahren nach Süden.");
					tank--;
				} else if (direction.equalsIgnoreCase("Westen")) {
					System.out.println("Sie fahren nach Westen.");
					tank--;
				} else if (direction.equalsIgnoreCase("Osten")) {
					System.out.println("Sie fahren nach Osten.");
					tank--;
				} else if (direction.equalsIgnoreCase("Quit")) {
					driving=reallyQuit();
				} else {
					System.out.println("Eingabe ungültig...");
				}
			} else {
				System.out.println("Tank leer...tanken oder Spiel beenden?[Tanken/Quit]");
				String fill = s.next();
				if (fill.equalsIgnoreCase("Tanken")) {
					tank=gettank(tank);
				} else if (fill.equalsIgnoreCase("Quit")) {
					driving=reallyQuit();
				} else {
					System.out.println("Eingabe ungültig..");
				}		
			}
		}//end while
	}//end main
	
	public static int gettank(int liter) {
		System.out.println("Wieviel Liter möchten Sie tanken? Maximal 35 möglich.");
		liter = s.nextInt();

		if (liter > 0 && liter <= 35) {
			return liter;
		} else {
			System.out.println("Ungültig. Maximal 35 Liter möglich.");
		}
		return liter;
	}
	
	private static boolean reallyQuit() {
		System.out.println("Sind Sie sicher, dass Sie das Spiel beenden wollen?[Ja/Nein]");
		String input = s.next();
		
		if (input.equalsIgnoreCase("Ja")) {
			System.out.println("Exit---------------------------------");
			return false;
		} else if (input.equalsIgnoreCase("Nein")) {
			return true;
		} else {
			System.out.println("Eingabe ungültig...");
		}
		return true;
	}	
	
}
