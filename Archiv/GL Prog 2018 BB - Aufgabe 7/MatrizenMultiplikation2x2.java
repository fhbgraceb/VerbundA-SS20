package aufgabe07;

import java.util.Scanner;

/*
 * Matrizenmultiplikation2x2: 
 * 
 * Lesen Sie zwei zweidimensionale 2x2 Matrizen ein und 
 * multiplizieren Sie diese. 
 * 
 * Speichern Sie dabei das Ergebnis in einer dritten Matrix.
 */
public class MatrizenMultiplikation2x2 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		int[][] c = new int[2][2];
		
		int summe;

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
