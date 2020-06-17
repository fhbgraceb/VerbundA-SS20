package BernalHausuebung7.copy;

import java.util.Scanner;

public class a_1_Matrizenaddition2x2 {
	/*
	 * Lesen Sie zwei zweidimensionale 2x2 Matrizen ein (mit zwei Zeilen und 2 Spalten) 
	 * und addieren Sie diese. Speichern Sie dabei das Ergebnis in einer dritten Matrix.
	 * */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		int[][] c = new int[2][2];
		
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
		 * Bei der Addition werden immer die an derselben Stelle liegenden Elemente addiert.
		 */
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c[i].length; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
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
		System.out.println("Matrix C =  A + B:");
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
