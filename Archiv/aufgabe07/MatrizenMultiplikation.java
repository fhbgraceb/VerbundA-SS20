package aufgabe07;

/*
 * Matrizenmultiplikation: 
 * 
 * Lesen Sie zwei beliebig große Matrizen ein 
 * (lesen Sie zunächst die Dimensionen der Matrizen ein) 
 * und multiplizieren Sie diese. 
 * Speichern Sie dabei das Ergebnis in einer dritten Matrix.
 * 
 * Anmerkung:
 * Bei einer Matrizenmultiplikation muss 
 * 	die Anzahl der Spalten der ersten Matrix mit 
 *  der Anzahl der Zeilen der zweiten Matrix
 * übereinstimmen.  
 * 
 */
import java.util.Scanner;

/*
 *  TODO: 
 *  
 *  Unterprogramme 
 *  
 *   * zum Einlesen von Matrizen (mit Parameter für Namen)
 *   * zum Ausgeben von Matrizen
 *   
 *  Menü:
 *  
 *   * ob die Daten eingelesen werden sollen
 *   * oder (welche) der Testdaten verwendet werden sollen
 */


public class MatrizenMultiplikation 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		// Variable für die Grössen der Matrizen
		int zeilenA;
		int spaltenA;
		int zeilenB;
		int spaltenB;
		/*
		 *  Matrizen definieren
		 *  Grösse wird noch keine angegeben
		 *   - die Matrizen haben keinen Speicherbereich, sondern den Wert null.
		 */
		int[][] a;
		int[][] b;
		int[][] c;
		
		int summe;

		// Grösse der Matrizen einlesen
		System.out.print("Anzahl der Zeilen von A: ");
		zeilenA = s.nextInt();
		System.out.print("Anzahl der Spalten von A: ");
		spaltenA = s.nextInt();
		System.out.println("Die Anzahl der Zeilen von B ergibt sich aus den Spalten von A.");
		zeilenB = spaltenA;
		System.out.print("Anzahl der Spalten von B: ");
		spaltenB = s.nextInt();
		
		/*
		 *  Matrizen auf die richtige Größe "aufblasen".
		 *  Die Grösse von C leitet sich aus den Grössen von A und B ab.
		 */
		a = new int[zeilenA][spaltenA];
		b = new int[zeilenB][spaltenB];
		c = new int[zeilenA][spaltenB];

		System.out.println("Eingabe von Matrix A:");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print("Bitte a[" + i + "][" + j + "] eingeben: ");
				a[i][j] = s.nextInt();
			}
		}

		System.out.println();
		System.out.println("Eingabe von Matrix B:");
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b[i].length; j++)
			{
				System.out.print("Bitte b[" + i + "][" + j + "] eingeben: ");
				b[i][j] = s.nextInt();
			}
		}

		/*
		 * Testdaten
		 * Die obige Definition der Matrizen wird wieder überschrieben.
		 */
//		a = new int[][]{{1, 2, 3, 4},{2, 3, 4, 5},{2, 3, 5, 4}};
//		b = new int[][]{{3, 2, 4},{4, 2, 5},{5, 2, 3},{3, 4, 1}}; 
//		c = new int[3][3];
		
		// Beispieldaten aus Wikipedia:
//		a = new int[][]{{1, 2, 3},{4, 5, 6}};
//		b = new int[][]{{6, -1},{3, 2},{0, -3}};
//		c = new int[2][2];
		

		// Das Produkt einer (l*m)-Matrix A und einer (m*n)-Matrix B
		// ist eine (l*n)-Matrix C.
		//
		// Cij = Summe (k = 1 .. m) Aik * Bkj
		//
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c[i].length; j++)
			{
				summe = 0;
				for (int k = 0; k < b.length; k++)
				{
					summe += a[i][k] * b[k][j];
				}
				c[i][j] = summe;
			}
		}

		System.out.println();
		System.out.println("Matrix A: ");
		System.out.println("----------");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Matrix B: ");
		System.out.println("----------");
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b[i].length; j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Matrix C =  A * B:");
		System.out.println("-------------------");
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c[i].length; j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
