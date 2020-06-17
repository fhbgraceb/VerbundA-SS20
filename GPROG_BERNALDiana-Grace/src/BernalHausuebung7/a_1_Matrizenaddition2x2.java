package BernalHausuebung7;

import java.util.Scanner;

public class a_1_Matrizenaddition2x2 {
	/*
	 * Lesen Sie zwei zweidimensionale 2x2 Matrizen ein (mit zwei Zeilen und 2 Spalten) 
	 * und addieren Sie diese. Speichern Sie dabei das Ergebnis in einer dritten Matrix.
	 * */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[][] eins = new int[2][2];
		int[][] zwei = new int[2][2];
		int[][] drei = new int[2][2];
		
		System.out.println("Erste Matrix eingeben: ");
		for (int i = 0; i < eins.length; i++)
		{
			for (int j = 0; j < eins[i].length; j++)
			{
				System.out.print("eins[" + i + "][" + j + "] eingeben: ");
				eins[i][j] = s.nextInt();
			}
		}

		System.out.println("\nZweite Matrix eingeben:");
		for (int i = 0; i < zwei.length; i++)
		{
			for (int j = 0; j < zwei[i].length; j++)
			{
				System.out.print("zwei[" + i + "][" + j + "] eingeben: ");
				zwei[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < drei.length; i++)
		{
			for (int j = 0; j < drei[i].length; j++)
			{
				drei[i][j] = eins[i][j] + zwei[i][j];
			}
		}

		System.out.println("\n=============\nMatrix eins:");
		for (int i = 0; i < eins.length; i++)
		{
			for (int j = 0; j < eins[i].length; j++)
			{
				System.out.print(eins[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("=============\nMatrix zwei:");
		for (int i = 0; i < zwei.length; i++)
		{
			for (int j = 0; j < zwei[i].length; j++)
			{
				System.out.print(zwei[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("===================\nMatrix C =  A + B:");
		for (int i = 0; i < drei.length; i++)
		{
			for (int j = 0; j < drei[i].length; j++)
			{
				System.out.print(drei[i][j] + " ");
			}
			System.out.println();
		}

	}

}
