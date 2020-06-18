package _glProg_2016_NT1_A;

public class Matrix 
{

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
