package BernalHausuebung6;

import java.util.Scanner;

public class l_Eratosthenes {
	
	/* Bestimmen Sie alle Primzahlen bis zu einem gegebenen n mit Hilfe des
		„Siebs des Eratosthenes“.
	*/

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean[] zahlen;
		int max;
		int n;		
		int streichen;	
		
		System.out.print("Bis zu welcher Zahl sollen die Primzahlen gehen? ");
		max = s.nextInt();
		zahlen = new boolean[max + 1];	
		
		for (int i = 2; i <= max; i++)
		{
			zahlen[i] = true;
		}
		
		n = 2;
		while (n <= max){

			for (streichen = n * n; streichen <= max; streichen += n){
				zahlen[streichen] = false;
			}
			
			do{
				n++;				
			}
			while ((n <= max) && (! zahlen[n]));
		}
		
		System.out.println("Primzahlen bis " + max + " sind:");
		for (int i = 2; i < max; i++)
		{
			if (zahlen[i])		
			{
				System.out.print(i + " ... ");
			}
		}
		
		s.close();
	}
}
