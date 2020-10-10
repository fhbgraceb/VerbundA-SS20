package BernalHausuebung7;

import java.util.Scanner;

public class a_3_Matrizenmultiplikation {
	/*
	 * Lesen Sie zwei beliebig große Matrizen ein (lesen Sie zunächst die Dimensionen der Matrizen ein) 
	 * und multiplizieren Sie diese. Speichern Sie dabei das Ergebnis in einer dritten Matrix.
	 * */
	
	//"Um zwei Matrizen miteinander multiplizieren zu können, 
	//muss die Spaltenzahl der ersten Matrix mit der Zeilenzahl der zweiten Matrix übereinstimmen."

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int zeilenEins;
		int spaltenEins;
		int zeilenZwei;
		int spaltenZwei;

		int[][] eins;
		int[][] zwei;
		int[][] drei;
		
		int summe;

		System.out.print("Zeilenanzahl von Matrix Eins: ");
		zeilenEins = s.nextInt();
		System.out.print("Spaltenanzahl von Matrix Eins: ");
		spaltenEins = s.nextInt();
		System.out.println("Anzahl der Zeilen von Matrix Zwei = Spalten von Matrix Eins");
		zeilenZwei = spaltenEins;
		System.out.print("Anzahl der Spalten Matrix Zwei: ");
		spaltenZwei = s.nextInt();
		
		eins = new int[zeilenEins][spaltenEins];
		zwei = new int[zeilenZwei][spaltenZwei];
		drei = new int[zeilenEins][spaltenZwei];

		System.out.println("Matrix eins:");
		for (int i = 0; i < eins.length; i++){
			for (int j = 0; j < eins[i].length; j++){
				System.out.print("eins[" + i + "][" + j + "] eingeben: ");
				eins[i][j] = s.nextInt();
			}
		}

		System.out.println();
		System.out.println("Matrix zwei:");
		for (int i = 0; i < zwei.length; i++){
			for (int j = 0; j < zwei[i].length; j++){
				System.out.print("Bitte b[" + i + "][" + j + "] eingeben: ");
				zwei[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < drei.length; i++){
			for (int j = 0; j < drei[i].length; j++){
				summe = 0;
				for (int k = 0; k < zwei.length; k++){
					summe += eins[i][k] * zwei[k][j];
				}
				drei[i][j] = summe;
			}
		}

		System.out.println();
		System.out.println("=============\nMatrix eins: ");
		for (int i = 0; i < eins.length; i++){
			for (int j = 0; j < eins[i].length; j++){
				System.out.print(eins[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("=============\nMatrix zwei: ");
		for (int i = 0; i < zwei.length; i++){
			for (int j = 0; j < zwei[i].length; j++){
				System.out.print(zwei[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("====================\nMatrix C =  A * B:");
		for (int i = 0; i < drei.length; i++){
			for (int j = 0; j < drei[i].length; j++){
				System.out.print(drei[i][j] + " ");
			}
			System.out.println();
		}

		s.close();
	}


}
