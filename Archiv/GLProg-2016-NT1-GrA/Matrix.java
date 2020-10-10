package _glProg_2016_NT1_A;

public class Matrix 
{

	/*
	Erstellen Sie ein Unterprogramm „matrix“, an das 4 Zahlen übergeben werden.
Die erste Zahl ist die Anzahl der Zeilen, die zweite Zahl ist die Anzahl der Spalten einer Matrix.
Die dritte Zahl stellt die Untergrenze und die vierte Zahl die Obergrenze für Zufallszahlen dar.
Befüllen Sie nun die Matrix mit ganzzahligen Zufallszahlen, welche zwischen Unter- und Obergrenze liegen
(die Grenzen dürfen nicht dabei sein!).
Erstellen Sie nun ein neues Array, in dem die Summen der Werte der Zeilen und ein weiteres Array,
in dem die Summen der Werte der Spalten abgespeichert werden.
Nun suchen Sie jeweils die größte Zahl aus den beiden soeben erzeugten Arrays.
Abschließend multiplizieren Sie die beiden Maxima (die Sie gerade aus den Arrays herausgesucht haben)
und geben das Produkt als Ergebnis zurück.
Im Unterprogramm selbst müssen keine Ausgaben erfolgen.

Beispiel:
Aufruf:	 	matrix(3, 2, 7, 16)
Ergebnis:	1023

Erklärung (muss nicht ausgegeben werden!):
Befüllte Matrix:
			8   8
 			14  15
 			 9  10

MatrixZ:	16 29 19	(8+8=16, 14+15=29, 9+10=19)
MatrixS:	31 33 	(8+14+9=31, 8+15+10=33)
MaximumZ:	29		(Größte Zahl aus 16, 29, 19 ist 29)
MaximumS:	33		(Größte Zahl aus 31, 33 ist 33)
Rückgabe:	1023		(33 * 31 = 1023)

	* */

	public static void main(String[] args) 
	{
		System.out.println(matrix(3, 2, 8, 15));
	}
	
	public static int matrix(int zeilen, int spalten, int min, int max) 
	{
		int ergebnis = 0;
		int[][] matrix = new int[zeilen][spalten];
		int[] zeilenSummen = new int[zeilen];
		int[] spaltenSummen = new int[spalten];
		int zeilenMaximum = Integer.MIN_VALUE;

		int spaltenMaximum = Integer.MIN_VALUE;
		
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix[i].length; j++) 
			{
				matrix[i][j] = (int)(Math.random() * ((max - 1) - (min + 1) + 1) + min);
			}
		}

		for (int zeile = 0; zeile < matrix.length; zeile++) 
		{
			for (int spalte = 0; spalte < matrix[zeile].length; spalte++) 
			{
				zeilenSummen[zeile] += matrix[zeile][spalte];
				spaltenSummen[spalte] += matrix[zeile][spalte];
			}
		}
		
		for (int i = 0; i < zeilenSummen.length; i++) 
		{
			if (zeilenSummen[i] > zeilenMaximum) 
			{
				zeilenMaximum = zeilenSummen[i];
			}
		}
		
		for (int i = 0; i < spaltenSummen.length; i++) 
		{
			if (spaltenSummen[i] > spaltenMaximum) 
			{
				spaltenMaximum = spaltenSummen[i];
			}
		}
		
		ergebnis = zeilenMaximum * spaltenMaximum;
		
		return ergebnis;
	}

}
