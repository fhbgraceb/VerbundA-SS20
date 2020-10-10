package bernalPractice;

import java.util.Scanner;

public class HTersetzen {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int zeilen;
		final int spalten;
		int[][] m;		// Die Matrix kann erst erzeugt werden, wenn die Gr��e eingelesen wurde
		int[] z = new int[9];
		int nrZufallszahl;

		System.out.print("Zeilen: ");
		zeilen = s.nextInt();
		System.out.print("Spalten: ");
		spalten = s.nextInt();
		m = new int[zeilen][spalten];	// Jetzt kann man die Matrix erzeugen
		
		// Das bef�llen der Matrix und die Ausgabe wird in einem Schritt durch gef�hrt
		System.out.println("Ursprüngliche Matrix: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int)(Math.random() * (9 - 1 + 1) + 1);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nZufallszahlen: ");
		for (int i = 0; i < z.length; i++) {
			z[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
			System.out.print(z[i]);
			// Nach dem letzten Element gibt es keinen Beistrich mehr
			if (i < z.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		
		// Weil der n�chste Vorgang komplizierter ist, wird die Ausgabe getrennt durchgef�hrt
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				nrZufallszahl = m[i][j];
				m[i][j] = z[nrZufallszahl - 1];
				
				//System.out.print(m[i][j] + " ");
			}
		}

		System.out.println("\nMatrix mit Zufallszahlen: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
