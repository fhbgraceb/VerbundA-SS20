package hausuebung4;

import java.util.Scanner;

public class h_Intervall2 {
	/*
	 8. Intervall2: Lesen Sie zwei ganze Zahlen ein.
	ï Falls die zweite Zahl kleiner ist als die erste, geben Sie nichts aus.
	ï Andernfalls geben Sie alle ganzen Zahlen von der ersten bis zur zweiten aus.

	Beispiel:
	Eingabe: 13 und 11
	Ausgabe: nichts
	Eingabe: 7 und 11
	Ausgabe; 7, 8, 9, 10, 11

	 */
	
	public static void main(String[] args) {
			Scanner s = new Scanner (System.in);
			int eingabe = -1;
			int grenzeU = 0;
			int grenzeO = 0;
			int kleiner = 0;
			int groeﬂer = 0;
			int imIntervall = 0;
		
			
			
			while(eingabe != 0){
				System.out.print("Geben Sie eine Zahl ein: ");
				eingabe = s.nextInt();
				
				if(eingabe < grenzeU && eingabe != 0) kleiner++;

				else if (eingabe > grenzeO) groeﬂer++;

				else if (eingabe >= grenzeU && eingabe <= grenzeO) imIntervall++;
				
			}
			System.out.println("---------------RESULT-------------");
			System.out.println("Dar¸ber waren  " +groeﬂer+" Zahlen");
			System.out.println("Im Intervall waren "+imIntervall+" Zahlen");
			System.out.println("Darunter waren " +kleiner+" Zahlen");
			System.out.println("------------------------");
			
			s.close();
	}

}
