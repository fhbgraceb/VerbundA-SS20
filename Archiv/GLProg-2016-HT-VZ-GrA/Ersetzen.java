package _glProh_2016_HT_VZ_GrA;

import java.util.Scanner;

public class Ersetzen {

	/*Lassen Sie den Benutzer Ihres Programmes die Anzahl der Zeilen und die Anzahl der Spalten einer Matrix eingeben.
Erzeugen Sie eine Matrix mit dieser Größe, füllen Sie sie mit Zufallszahlen von 1 bis 9 und geben Sie die Matrix aus.
Erzeugen Sie dann 9 zweistellige Zufallszahlen, speichern Sie diese in geeigneter Form und
geben Sie die Zahlen durch Beistriche getrennt aus.
Ersetzen Sie dann die Zahlen der Matrix durch die zweistelligen Zufallszahlen in der folgenden Form:
Die Zahl 1 soll durch die erste Zufallszahl ersetzt werden.
Die Zahl 2 soll durch die zweite Zufallszahl ersetzt werden.
…
Die Zahl 9 soll durch die neunte Zufallszahl ersetzt werden.
Geben Sie dann die Matrix erneut aus.
Die Ausgabe könnte – für eine 3x3 Matrix – wie folgt aussehen:
Ursprüngliche Matrix:
1 3 2
4 5 3
2 7 4

Zufallszahlen:
22, 33, 21, 65, 54, 34, 99, 62, 58

Matrix mit zweistelligen Zufallszahlen:
22 21 33
65 54 21
33 99 65

	* */
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
		System.out.println("Urspr�ngliche Matrix: ");
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
