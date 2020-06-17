package BernalHausuebung6;

import java.util.Scanner;

public class e_Durchschnitt {
	
	/* Lesen Sie beliebig viele (maximal 50) Zahlen ein (Abschluss mit 0) 
	 * und speichern Sie diese in einem Array. 
	 * Berechnen Sie danach den Durchschnitt der eingelesenen Werte.
	*/

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int max = 50;
		final int end = 0;
		double summe = 0;
		int counter = 0;
		int temp = -1;
		int[] array = new int[max];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Zahl "+(i+1)+" = ");
			temp = s.nextInt();
			if (temp != end){	
				array[i]= temp;
				counter++;
			}
			else{
				i = max;
			}
			
		}
		
		for(int i = 0; i < counter;i++){
			summe += array[i];
		}
		summe = summe /counter;
		System.out.println("Durchschnitt ist "+ (summe));

		s.close();
	}	

}
