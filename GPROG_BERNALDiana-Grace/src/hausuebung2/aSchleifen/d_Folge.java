package hausuebung2.aSchleifen;

import java.util.Scanner;

public class d_Folge {
	/*
	Aufgabe:
	4. Folge: Überprüfen Sie, ob die Folge ni+1 = ni / 2 für gerade ni n
	i+1 = 3ni + 1 für ungerade ni 
	für unterschiedliche (beliebige) positive Startwerte n1 immer den Wert 1 erreicht.
	*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		int ni;	
		
		System.out.print("Bitte geben Sie n ein: ");
		n = s.nextInt();
		
		ni = n;
		while (ni != 1){
			if (ni % 2 == 0){		
				ni = ni / 2;
			}else{		
				ni = 3 * ni + 1;
			}
			System.out.printf("n%d \n", ni);
		}
		
		s.close();
	}
}
